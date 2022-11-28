package Backend.Project.BookMyShow.Dto.EntryRequestDto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MovieEntryDto {
    String name;
    LocalDate releaseDate;
}
