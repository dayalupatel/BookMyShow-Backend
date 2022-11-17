package Backend.Project.BookMyShow.Dto;

import java.time.LocalDate;
import java.util.List;

import lombok.*;

@Getter
@Setter
@Builder
public class MovieDto {
    int id;
    String name;
    LocalDate releaseDate;
    List<ShowDto> showList;
}
