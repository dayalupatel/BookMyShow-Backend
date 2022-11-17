package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.MovieDto;
import Backend.Project.BookMyShow.Model.MovieEntity;

public class MovieConverter {
    public static MovieEntity convertDtoToEntity(MovieDto movieDto) {
        return MovieEntity.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }
    public static MovieDto convertEntityToDto(MovieEntity movieEntity) {
        return MovieDto.builder().name(movieEntity.getName()).releaseDate(movieEntity.getReleaseDate()).build();
    }
}
