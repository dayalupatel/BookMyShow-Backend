package Backend.Project.BookMyShow.Service;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.UserEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;

public interface UserService {
    // Add User
    UserResponseDto addUser(UserEntryDto userEntryDto);

    // Get User
    UserResponseDto getUser(int id);
}
