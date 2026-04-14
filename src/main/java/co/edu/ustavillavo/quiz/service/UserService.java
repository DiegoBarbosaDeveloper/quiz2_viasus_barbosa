package co.edu.ustavillavo.quiz.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ustavillavo.quiz.controller.dto.User;
import co.edu.ustavillavo.quiz.mappers.UserMapper;
import co.edu.ustavillavo.quiz.repository.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    public User saveUser(@NonNull User user){
        return mapper.toDto(userRepository.save(mapper.toEntity(user)));
    }
    

    public User findByUserName(@NonNull String userName){
        return mapper.toDto(userRepository.findByUserName(userName));
    }

    public User findById(@NonNull Long id){
        return mapper.toDto(userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found")));
    }

    public User updateUser(@NonNull User user){
        return mapper.toDto(userRepository.save(mapper.toEntity(user)));
    }

    public void deleteUser(@NonNull Long id){
        userRepository.deleteById(id);
    }
        
}
