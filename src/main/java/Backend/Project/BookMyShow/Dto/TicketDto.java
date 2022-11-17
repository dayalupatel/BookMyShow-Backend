package Backend.Project.BookMyShow.Dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {
    int id;
    String alotedSeat;
    double amount;
    UserDto userDto;
    ShowDto showDto;
}
