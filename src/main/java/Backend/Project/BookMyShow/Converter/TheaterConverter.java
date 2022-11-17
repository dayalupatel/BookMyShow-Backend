package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.TheaterDto;
import Backend.Project.BookMyShow.Model.TheaterEntity;

public class TheaterConverter {
    public static TheaterEntity convertDtoToEntity(TheaterDto theaterDto) {
        return TheaterEntity.builder().name(theaterDto.getName()).address(theaterDto.getAddress()).build();
    }
    
    public static TheaterDto convertEntityToDto(TheaterEntity theaterEntity) {
        return null;
    }
}
