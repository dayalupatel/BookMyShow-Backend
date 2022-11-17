package Backend.Project.BookMyShow.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Converter.ShowConverter;
import Backend.Project.BookMyShow.Dto.ShowDto;
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
    public ShowEntity addShow(ShowDto showDto) {
        ShowEntity showEntity = ShowConverter.convertDtoToEntity(showDto);
        
        MovieEntity movieEntity = movieRepository.findById(showDto.getMovieDto().getId()).get();
        
        TheaterEntity theaterEntity = theaterRepository.findById(showDto.getTheaterDto().getId()).get();
        
        showEntity.setMovie(movieEntity);
        showEntity.setTheater(theaterEntity);

        generateShowEntitySeats(theaterEntity.getTheaterSeatList(), showEntity);

        showRepository.save(showEntity);
        
        return showEntity;
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
    }

    @Override
    public ShowDto getShow(int id) {
        ShowEntity showEntity = showRepository.findById(id).get();
        ShowDto showDto = ShowConverter.convertEntityToDto(showEntity);
        return showDto;
    }
    
}
