package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.ShowEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import Backend.Project.BookMyShow.Model.ShowEntity;

public class ShowConverter {
    public static ShowEntity convertDtoToEntity(ShowEntryDto showEntryDto) {
        return ShowEntity.builder().showDate(showEntryDto.getShowDate()).
        showTime(showEntryDto.getShowTime()).build();
    }
    
    public static ShowResponseDto convertEntityToDto(ShowEntity showEntity){

        return ShowResponseDto.builder()
                .id(showEntity.getId())
                .showTime(showEntity.getShowTime())
                .showDate(showEntity.getShowDate())
                .build();
    }
}
