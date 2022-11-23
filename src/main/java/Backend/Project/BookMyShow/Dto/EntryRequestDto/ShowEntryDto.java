package Backend.Project.BookMyShow.Dto.EntryRequestDto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

import Backend.Project.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.TheaterResponseDto;

@Data
@Builder
public class ShowEntryDto {
    LocalDate showDate;

    LocalTime showTime;

    MovieResponseDto movieResponseDto;

    TheaterResponseDto theaterResponseDto; 
}
