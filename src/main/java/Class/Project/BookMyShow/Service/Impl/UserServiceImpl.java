package Class.Project.BookMyShow.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import Class.Project.BookMyShow.Converter.UserConverter;
import Class.Project.BookMyShow.Dto.UserDto;
import Class.Project.BookMyShow.Model.UserEntity;
import Class.Project.BookMyShow.Repository.UserRepository;
import Class.Project.BookMyShow.Service.UserService;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity = null; // something here
        userRepository.save(userEntity);
    }

    @Override
    public UserDto getUser(int id) {
        // UserEntity user = userRepository.findById(id);
        UserEntity user = null;
        UserDto userDto = UserConverter.convertUserEntityToUserDto(user);

        return userDto;
    }
    
}
