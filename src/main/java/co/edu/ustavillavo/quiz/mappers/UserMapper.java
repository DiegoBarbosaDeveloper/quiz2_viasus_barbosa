package co.edu.ustavillavo.quiz.mappers;

import org.mapstruct.Mapper;

import co.edu.ustavillavo.quiz.controller.dto.User;
import co.edu.ustavillavo.quiz.repository.model.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toDto(UserEntity userEntity);
    UserEntity toEntity(User user);
}
