package Class.Project.BookMyShow.Converter;

import Class.Project.BookMyShow.Dto.UserDto;
import Class.Project.BookMyShow.Model.UserEntity;
// import lombok.experimental.UtilityClass;

// @UtilityClass
/*
 * # Utility class -> 1. all methods are static 
 *                    2. no need to make obj
 * 
 */
public class UserConverter {
    public static UserEntity convertUserDtoToUserEntity(UserDto userDto) {
        return UserEntity.builder().name(userDto.getName()).mobileNo(userDto.getMobileNo()).build();
    }

    public static UserDto convertUserEntityToUserDto(UserEntity user) {
        return UserDto.builder().id(user.getId()).name(user.getName()).mobileNo(user.getMobileNo()).build();
    }
}
