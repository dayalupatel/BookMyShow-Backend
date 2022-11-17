package Backend.Project.BookMyShow.Dto;

import java.util.List;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterDto {
    int id;
    String name;
    String address;
    String city;
    List<ShowDto> showDtoList;
}
