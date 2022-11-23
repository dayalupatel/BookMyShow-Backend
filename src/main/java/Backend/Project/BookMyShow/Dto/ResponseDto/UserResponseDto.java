package Backend.Project.BookMyShow.Dto.ResponseDto;

import java.util.List;

import Backend.Project.BookMyShow.Dto.TicketDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {
    int id;
    String name;
    String mobNo;

    // optional
    List<TicketDto> tickets;
}
