package Backend.Project.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.Project.BookMyShow.Dto.UserDto;
import Backend.Project.BookMyShow.Model.UserEntity;
import Backend.Project.BookMyShow.Service.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    
    @PostMapping("/add-user")
    public ResponseEntity<UserEntity> addUser(@RequestBody UserDto userDto) {
        UserEntity userEntity = userService.addUser(userDto);
        return new ResponseEntity<>(userEntity, HttpStatus.CREATED);
    } 

    @GetMapping("/get-user-by-id/{id}")
    public ResponseEntity<UserDto> getMethodName(@PathVariable(value = "id") int id) {
        UserDto userDto = userService.getUser(id);
        return new ResponseEntity<>(userDto, HttpStatus.FOUND);
    }
    
}
