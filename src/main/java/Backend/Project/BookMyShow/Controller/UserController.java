package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.UserEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import Backend.Project.BookMyShow.Service.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    
    @PostMapping("/add-user")
    public ResponseEntity<UserResponseDto> addUser(@RequestBody UserEntryDto userEntryDto) {
        UserResponseDto userResponseDto = userService.addUser(userEntryDto);
        return new ResponseEntity<>(userResponseDto, HttpStatus.CREATED);
    } 

    @GetMapping("/get-user-by-id/{id}")
    public ResponseEntity<UserResponseDto> getMethodName(@PathVariable(value = "id") int id) {
        UserResponseDto userResponseDto = userService.getUser(id);
        return new ResponseEntity<>(userResponseDto, HttpStatus.FOUND);
    }
    
}
