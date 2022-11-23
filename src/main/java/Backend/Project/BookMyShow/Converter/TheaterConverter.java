package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.TheaterEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import Backend.Project.BookMyShow.Model.TheaterEntity;

public class TheaterConverter {
    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto) {
        return TheaterEntity.builder()
            .name(theaterEntryDto.getName())
            .address(theaterEntryDto.getAddress())
            .city(theaterEntryDto.getCity())
            .theaterType(theaterEntryDto.getTheaterType()).build();
    }
    
    public static TheaterResponseDto convertEntityToDto(TheaterEntity theaterEntity) {
        return TheaterResponseDto.builder()
            .name(theaterEntity.getName())
            .address(theaterEntity.getAddress())
            .city(theaterEntity.getCity())
            .theaterType(theaterEntity.getTheaterType()).build();
    }
}
