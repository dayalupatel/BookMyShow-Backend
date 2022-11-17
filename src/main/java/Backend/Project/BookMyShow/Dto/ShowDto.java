package Backend.Project.BookMyShow.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.*;

@Data
@Builder
public class ShowDto {
    int id;
    LocalDate showDate;
    LocalTime showTime;
    MovieDto movieDto;
    TheaterDto theaterDto;
}
