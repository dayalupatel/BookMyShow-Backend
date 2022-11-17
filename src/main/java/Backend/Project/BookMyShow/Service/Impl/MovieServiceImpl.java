package Backend.Project.BookMyShow.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import Backend.Project.BookMyShow.Converter.MovieConverter;
import Backend.Project.BookMyShow.Dto.MovieDto;
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
    public MovieEntity addMovie(MovieDto movieDto) {
        log.info("Adding the Movie", movieDto);

        MovieEntity movieEntity = MovieConverter.convertDtoToEntity(movieDto);
        movieRepository.save(movieEntity);

        return movieEntity;
    }

    @Override
    public MovieDto getMovie(int id) {
        MovieEntity movieEntity = movieRepository.findById(id).get();
        MovieDto movieDto = MovieConverter.convertEntityToDto(movieEntity);
        return movieDto;
    }
    
}
