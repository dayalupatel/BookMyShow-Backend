package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.MovieDto;
import Backend.Project.BookMyShow.Model.MovieEntity;

public interface MovieService {
    // Add Movie
    MovieEntity addMovie(MovieDto movieDto);
    
    // Get Movie
    MovieDto getMovie(int id);

}
