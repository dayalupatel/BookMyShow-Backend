package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.ShowEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.ShowResponseDto;

public interface ShowService {
    // Add Show
    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    // Get Show
    ShowResponseDto getShow(int id);
}
