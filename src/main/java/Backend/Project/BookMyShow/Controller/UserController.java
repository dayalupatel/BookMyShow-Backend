package Backend.Project.BookMyShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.EntryRequestDto.UserEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import Backend.Project.BookMyShow.Model.UserEntity;
import Backend.Project.BookMyShow.Service.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



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

    @GetMapping("/get-user")
    public ResponseEntity<UserResponseDto> getUser(@RequestParam(value = "id") int id) {
        UserResponseDto userResponseDto = userService.getUser(id);
        return new ResponseEntity<>(userResponseDto, HttpStatus.FOUND);
    }

    @GetMapping("/get-all-user")
    public ResponseEntity<List<UserEntity>> getAllUser() {
        List<UserEntity> usersList = userService.getAllUser();
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }
    
}
