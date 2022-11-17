package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.TheaterDto;

public interface TheaterService {
    // Add Theater
    TheaterDto addTheater(TheaterDto theaterDto);

    // Get Theater
    TheaterDto getTheater(int id);
}
