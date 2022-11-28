package Backend.Project.BookMyShow.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Converter.ShowConverter;
import Backend.Project.BookMyShow.Dto.EntryRequestDto.ShowEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import Backend.Project.BookMyShow.Model.MovieEntity;
import Backend.Project.BookMyShow.Model.ShowEntity;
import Backend.Project.BookMyShow.Model.ShowSeatsEntity;
import Backend.Project.BookMyShow.Model.TheaterEntity;
import Backend.Project.BookMyShow.Model.TheaterSeatEntity;
import Backend.Project.BookMyShow.Repository.MovieRepository;
import Backend.Project.BookMyShow.Repository.ShowRepository;
import Backend.Project.BookMyShow.Repository.ShowSeatRepository;
import Backend.Project.BookMyShow.Repository.TheaterRepository;
import Backend.Project.BookMyShow.Service.ShowService;

@Service
@Component
public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowRepository showRepository;
    @Autowired
    ShowSeatRepository showSeatRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    TheaterRepository theaterRepository;
    
    @Override
    public ShowResponseDto addShow(ShowEntryDto showEntryDto) {
        ShowEntity showEntity = ShowConverter.convertDtoToEntity(showEntryDto);
        
        MovieEntity movieEntity = movieRepository.findById(showEntryDto.getMovieResponseDto().getId()).get();
        
        TheaterEntity theaterEntity = theaterRepository.findById(showEntryDto.getTheaterResponseDto().getId()).get();
        
        showEntity.setMovie(movieEntity);
        showEntity.setTheater(theaterEntity);

        // Saving the Show
        showRepository.save(showEntity);

        generateShowEntitySeats(theaterEntity.getTheaterSeatList(), showEntity);
        
        // Saving the Show
        showRepository.save(showEntity);
        
        return ShowConverter.convertEntityToDto(showEntity);
    }

    void generateShowEntitySeats(List<TheaterSeatEntity> theaterSeatList, ShowEntity showEntity) {
        List<ShowSeatsEntity> showSeatEntityList = new ArrayList<>();
        
        for(TheaterSeatEntity tse : theaterSeatList) {
            ShowSeatsEntity showSeatEntity = ShowSeatsEntity.builder().seatNumber(tse.getSeatNumber()).
                rate(tse.getRate()).seatType(tse.getSeatType()).build();
            
            showSeatEntity.setShow(showEntity); // Belonging show with these virtual showseat
            
            showSeatEntityList.add(showSeatEntity);
        }

        // Saving all seats in repository
        showSeatRepository.saveAll(showSeatEntityList);

        // adding seatsList in show
        showEntity.setShowSeatList(showSeatEntityList);
    }

    @Override
    public ShowResponseDto getShow(int id) {
        ShowEntity showEntity = showRepository.findById(id).get();
        ShowResponseDto showResponseDto = ShowConverter.convertEntityToDto(showEntity);
        return showResponseDto;
    }
    
}
