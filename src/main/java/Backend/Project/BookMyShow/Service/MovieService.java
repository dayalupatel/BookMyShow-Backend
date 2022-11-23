package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.MovieEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.MovieResponseDto;

public interface MovieService {
    // Add Movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);
    
    // Get Movie
    MovieResponseDto getMovie(int id);

}
