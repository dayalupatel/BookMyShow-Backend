package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.TheaterSeatDto;

public interface TheaterSeatService {
    // Add theater Seat
    void addTheaterSeat(TheaterSeatDto TheaterDtoDto);

    // Get Theater Seat
    TheaterSeatDto getTheaterSeat(int id);
}
