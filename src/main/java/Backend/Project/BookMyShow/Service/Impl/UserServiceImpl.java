package Backend.Project.BookMyShow.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Backend.Project.BookMyShow.Converter.UserConverter;
import Backend.Project.BookMyShow.Dto.EntryRequestDto.UserEntryDto;
import Backend.Project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import Backend.Project.BookMyShow.Model.UserEntity;
import Backend.Project.BookMyShow.Repository.UserRepository;
import Backend.Project.BookMyShow.Service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDto addUser(UserEntryDto userEntryDto) {
        UserEntity userEntity = UserConverter.convertDtoToEntity(userEntryDto);
        userRepository.save(userEntity);
        return UserConverter.convertEntityToDto(userEntity);
    }

    @Override
    public UserResponseDto getUser(int id) {
        UserEntity user = userRepository.findById(id).get();

        UserResponseDto userResponseDto = UserConverter.convertEntityToDto(user);

        return userResponseDto;
    }

    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> usersList = userRepository.findAll();
        return usersList;
    }
    
}



























