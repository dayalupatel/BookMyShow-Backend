package Class.Project.BookMyShow.Converter;

import java.util.Set;

import Class.Project.BookMyShow.enums.SeatType;

public class BookTicketRequestDto {
    Set<String> requestedSeat;
    int userId;
    int showId;
    SeatType seatType;
}
