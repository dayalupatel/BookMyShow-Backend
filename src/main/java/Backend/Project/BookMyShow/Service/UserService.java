package Backend.Project.BookMyShow.Service;

import java.util.List;


import Backend.Project.BookMyShow.Dto.EntryRequestDto.UserEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import Backend.Project.BookMyShow.Model.UserEntity;

public interface UserService {
    // Add User
    UserResponseDto addUser(UserEntryDto userEntryDto);

    // Get User
    UserResponseDto getUser(int id);

    // Get All Users
    List<UserEntity> getAllUser();
}
