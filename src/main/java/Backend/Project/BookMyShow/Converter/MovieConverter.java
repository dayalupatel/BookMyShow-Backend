package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.MovieEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import Backend.Project.BookMyShow.Model.MovieEntity;

public class MovieConverter {
    public static MovieEntity convertDtoToEntity(MovieEntryDto movieEntryDto) {
        return MovieEntity.builder()
                .name(movieEntryDto.getName())
                .releaseDate(movieEntryDto.getReleaseDate()).build();
    }
    public static MovieResponseDto convertEntityToDto(MovieEntity movieEntity) {
        return MovieResponseDto.builder()
                .id(movieEntity.getId())
                .name(movieEntity.getName())
                .releaseDate(movieEntity.getReleaseDate()).build();
    }
}
