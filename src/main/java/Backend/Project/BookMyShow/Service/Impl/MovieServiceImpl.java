package Backend.Project.BookMyShow.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import Backend.Project.BookMyShow.Converter.MovieConverter;
import Backend.Project.BookMyShow.Dto.EntryRequestDto.MovieEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import Backend.Project.BookMyShow.Model.MovieEntity;
import Backend.Project.BookMyShow.Repository.MovieRepository;
import Backend.Project.BookMyShow.Service.MovieService;

@Service
@Component
@Slf4j
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {

        log.info("Adding the Movie", movieEntryDto);

        MovieEntity movieEntity = MovieConverter.convertDtoToEntity(movieEntryDto);
        movieRepository.save(movieEntity);

        return MovieConverter.convertEntityToDto(movieEntity);
    }

    @Override
    public MovieResponseDto getMovie(int id) {
        MovieEntity movieEntity = movieRepository.findById(id).get();
        MovieResponseDto movieResponseDto = MovieConverter.convertEntityToDto(movieEntity);
        return movieResponseDto;
    }
    
}
