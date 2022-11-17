package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.ShowDto;
import Backend.Project.BookMyShow.Model.ShowEntity;

public class ShowConverter {
    public static ShowEntity convertDtoToEntity(ShowDto showDto) {
        return ShowEntity.builder().showDate(showDto.getShowDate()).
        showTime(showDto.getShowTime()).build();
    }
    
    public static ShowDto convertEntityToDto(ShowEntity showEntity) {
        return ShowDto.builder()
            .showDate(showEntity.getShowDate())
            .showTime(showEntity.getShowTime())
            .build();
    }
}
