package Backend.Project.BookMyShow.Service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Converter.TicketConverter;
import Backend.Project.BookMyShow.Dto.BookTicketRequestDto;
import Backend.Project.BookMyShow.Dto.TicketDto;
import Backend.Project.BookMyShow.Model.ShowEntity;
import Backend.Project.BookMyShow.Model.ShowSeatsEntity;
import Backend.Project.BookMyShow.Model.TicketEntity;
import Backend.Project.BookMyShow.Model.UserEntity;
import Backend.Project.BookMyShow.Repository.ShowRepository;
import Backend.Project.BookMyShow.Repository.TicketRepository;
import Backend.Project.BookMyShow.Repository.UserRepository;
import Backend.Project.BookMyShow.Service.TicketService;

@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ShowRepository showRepository;
    
    @Override
    public TicketDto getTicket(int id) {
        TicketEntity ticketEntity = ticketRepository.findById(id).get();
        TicketDto ticketDto = TicketConverter.convertEntityToDto(ticketEntity);
        return ticketDto;
    }

    @Override
    public TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto) {
        // STEP 1 : finding user & show by ticketRequestDto
        UserEntity userEntity = userRepository.findById(bookTicketRequestDto.getUserId()).get();
        ShowEntity showEntity = showRepository.findById(bookTicketRequestDto.getShowId()).get();

        Set<String> requestedSeat = bookTicketRequestDto.getRequestedSeat();
        List<ShowSeatsEntity> showSeatsList = showEntity.getShowSeatList();

        // ## Option 1 to filter all seat based on some filter condition
        List<ShowSeatsEntity> bookedSeats = showSeatsList
                .stream()
                .filter( seat-> requestedSeat.contains(seat.getSeatNumber()) && !seat.isBooked() &&
                seat.getSeatType().equals(bookTicketRequestDto.getSeatType()) )
                .collect(Collectors.toList());
                
        
        // ## Option 2 :
        // List<ShowSeatsEntity> bookedSeats = new ArrayList<>();
        // for(ShowSeatsEntity seat : showSeatsList) {
        //     if(requestedSeat.contains(seat.getSeatNumber()) && !seat.isBooked()
        //     seat.getSeatType().equals(bookTicketRequestDto.getSeatType())) {
        //         bookedSeats.add(seat);
        //     }
        // }
        

        if(bookedSeats.size() < requestedSeat.size()) {
            // This means All the seats are not Available;
            throw new Error("All Seats Are Not Availble");
        }

        // STEP 2 : Buildin A ticketEntity
        
        TicketEntity ticketEntity = TicketEntity.builder()
                        .user(userEntity)
                        .show(showEntity)
                        .seatList(bookedSeats)
                        .build();


        // STEP 3 : 
        double amount = 0;

        for(ShowSeatsEntity seat : bookedSeats) {
            seat.setBooked(true);
            seat.setBookedAt(new Date());
            seat.setTicket(ticketEntity);

            amount += seat.getRate();
        }
        ticketEntity.setAllotedSeats(String.valueOf(bookedSeats));
        ticketEntity.setAmount(amount);

        //Connect in the Show and the user
        showEntity.getTicketList().add(ticketEntity);


        //Add the ticket in the tickets list of the user Entity
        userEntity.getTicketList().add(ticketEntity);

        //saving this ticket
        ticketRepository.save(ticketEntity);

        return TicketConverter.convertEntityToDto(ticketEntity);
    }
    
}
