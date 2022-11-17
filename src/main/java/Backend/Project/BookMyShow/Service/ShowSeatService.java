package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.ShowSeatDto;

public interface ShowSeatService {
    // Add Show Seat
    void addShowSeat(ShowSeatDto showSeatDto);

    // Get Show Seat
    ShowSeatDto getShowSeat(int id);
}
