package Backend.Project.BookMyShow.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Converter.TheaterConverter;
import Backend.Project.BookMyShow.Dto.TheaterDto;
import Backend.Project.BookMyShow.Model.TheaterEntity;
import Backend.Project.BookMyShow.Model.TheaterSeatEntity;
import Backend.Project.BookMyShow.Repository.TheaterRepository;
import Backend.Project.BookMyShow.Repository.TheaterSeatRepository;
import Backend.Project.BookMyShow.Service.TheaterService;
import Backend.Project.BookMyShow.enums.SeatType;

@Service
@Component
public class TheaterServiceImpl implements TheaterService {
    @Autowired
    TheaterRepository theaterRepository;
    @Autowired
    TheaterSeatRepository theaterSeatRepository;

    @Override
    public TheaterDto addTheater(TheaterDto theaterDto) {
        // we need a thater entity
        TheaterEntity theaterEntity = TheaterConverter.convertDtoToEntity(theaterDto);

        // create theater Seats
        List<TheaterSeatEntity> seats = createTheaterSeats();
        for(TheaterSeatEntity theaterSeatEntity : seats) {
            theaterSeatEntity.setTheater(theaterEntity);
        }

        theaterRepository.save(theaterEntity);

        return theaterDto;
    }

    List<TheaterSeatEntity> createTheaterSeats() {
        List<TheaterSeatEntity> seats = new ArrayList<>();
        
        seats.add(getTheaterSeat("1A", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("1B", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("1C", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("1D", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("1E", 100, SeatType.CLASSIC));
        
        seats.add(getTheaterSeat("2A", 100, SeatType.PREMIUM));
        seats.add(getTheaterSeat("2B", 100, SeatType.PREMIUM));
        seats.add(getTheaterSeat("2C", 100, SeatType.PREMIUM));
        seats.add(getTheaterSeat("2D", 100, SeatType.PREMIUM));
        seats.add(getTheaterSeat("2E", 100, SeatType.PREMIUM));

        theaterSeatRepository.saveAll(seats);

        return seats;
    }

    TheaterSeatEntity getTheaterSeat(String seatNumber, int rate, SeatType seatType) {
        return TheaterSeatEntity.builder().seatNumber(seatNumber).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheaterDto getTheater(int id) {
        TheaterEntity theaterEntity = theaterRepository.findById(id).get();
        TheaterDto theaterDto = TheaterConverter.convertEntityToDto(theaterEntity);
        return theaterDto;
    }
    
}
