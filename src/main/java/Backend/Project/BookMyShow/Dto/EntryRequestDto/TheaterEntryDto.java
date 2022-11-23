package Backend.Project.BookMyShow.Dto.EntryRequestDto;

import Backend.Project.BookMyShow.enums.TheaterType;
import lombok.*;

@Data
@Builder
public class TheaterEntryDto {
    String name;
    String address;
    String city;
    TheaterType theaterType;
}
