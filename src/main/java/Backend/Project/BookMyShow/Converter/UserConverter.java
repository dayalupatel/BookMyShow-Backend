package Backend.Project.BookMyShow.Converter;

import Backend.Project.BookMyShow.Dto.UserDto;
import Backend.Project.BookMyShow.Model.UserEntity;


public class UserConverter { 
    public static UserEntity convertDtoToEntity(UserDto userDto) {
        return UserEntity.builder().name(userDto.getName()).mobileNo(userDto.getMobileNo()).build();
    }

    public static UserDto convertEntityToDto(UserEntity user) {
        return UserDto.builder().id(user.getId()).name(user.getName()).mobileNo(user.getMobileNo()).build();
    }
}
