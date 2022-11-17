package Backend.Project.BookMyShow.Dto;

import java.util.Set;

import Backend.Project.BookMyShow.enums.SeatType;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class BookTicketRequestDto {
    Set<String> requestedSeat;
    int userId;
    int showId;
    SeatType seatType;
}

/*
 1. a DTO is a lighter weight class included only relevent information
    and to avoid heavy loaded unrelevent information

 2.  a DTO can contain information from a Entity
    also can contains atributes from different classes like boookTicketRequest;
 */