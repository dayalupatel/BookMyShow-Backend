package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.UserDto;
import Backend.Project.BookMyShow.Model.UserEntity;

public interface UserService {
    // Add User
    UserEntity addUser(UserDto userDto);

    // Get User
    UserDto getUser(int id);
}
