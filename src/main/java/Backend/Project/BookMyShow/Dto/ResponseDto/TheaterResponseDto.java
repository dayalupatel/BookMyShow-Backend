package Backend.Project.BookMyShow.Dto.ResponseDto;

import Backend.Project.BookMyShow.enums.TheaterType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheaterResponseDto {
    int id;
    String name;
    String address;
    String city;
    TheaterType theaterType;
}
