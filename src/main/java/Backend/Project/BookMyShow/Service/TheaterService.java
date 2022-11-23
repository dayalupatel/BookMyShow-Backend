package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.TheaterEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.TheaterResponseDto;

public interface TheaterService {
    // Add Theater
    TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto);

    // Get Theater
    TheaterResponseDto getTheater(int id);
}
