package Backend.Project.BookMyShow.Dto.ResponseDto;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieResponseDto {
    int id;
    String name;
    LocalDate releaseDate;

    //Optional
    List<ShowResponseDto> showDtoList;
}
