package Backend.Project.BookMyShow.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Converter.UserConverter;
import Backend.Project.BookMyShow.Dto.UserDto;
import Backend.Project.BookMyShow.Model.UserEntity;
import Backend.Project.BookMyShow.Repository.UserRepository;
import Backend.Project.BookMyShow.Service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity addUser(UserDto userDto) {
        UserEntity userEntity = UserConverter.convertDtoToEntity(userDto) ;
        userRepository.save(userEntity);
        return userEntity;
    }

    @Override
    public UserDto getUser(int id) {
        UserEntity user = userRepository.findById(id).get();

        UserDto userDto = UserConverter.convertEntityToDto(user);

        return userDto;
    }
    
}



























