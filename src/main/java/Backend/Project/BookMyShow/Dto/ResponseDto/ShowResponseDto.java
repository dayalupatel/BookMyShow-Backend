package Backend.Project.BookMyShow.Dto.ResponseDto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShowResponseDto {
    int id;
    LocalDate showDate;
    LocalTime showTime;

    MovieResponseDto movieResponseDto;

    TheaterResponseDto theaterDto;
}
