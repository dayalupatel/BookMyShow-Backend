package Class.Project.BookMyShow.Service;

import Class.Project.BookMyShow.Dto.UserDto;

public interface UserService {
    void addUser(UserDto userDto);
    UserDto getUser(int id);
}
