package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.UserEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import Backend.Project.BookMyShow.Model.UserEntity;


public class UserConverter { 
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto) {
        return UserEntity.builder()
            .name(userEntryDto.getName())
            .mobileNo(userEntryDto.getMobNo()).build();
    }

    public static UserResponseDto convertEntityToDto(UserEntity user) {
        return UserResponseDto.builder()
                .id(user.getId()).name(user.getName())
                .mobNo(user.getMobileNo()).build();
    }
}
