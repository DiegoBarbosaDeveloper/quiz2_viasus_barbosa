package co.edu.ustavillavo.quiz.service;

import org.springframework.stereotype.Service;

import co.edu.ustavillavo.quiz.controller.dto.User;
import co.edu.ustavillavo.quiz.mappers.UserMapper;
import co.edu.ustavillavo.quiz.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    public User saveUser(User user){
        return mapper.toDto(userRepository.save(mapper.toEntity(user)));
    }
    

    public User findByUserName(String userName){
        return mapper.toDto(userRepository.findByUserName(userName));
    }

    public User findById(Long id){
        return mapper.toDto(userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found")));
    }
        
}
