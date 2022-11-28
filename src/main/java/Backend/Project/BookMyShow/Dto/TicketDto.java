package Backend.Project.BookMyShow.Dto;

import Backend.Project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {
    int id;
    String alotedSeats;
    double amount;
    UserResponseDto user;
    ShowResponseDto show;
}
