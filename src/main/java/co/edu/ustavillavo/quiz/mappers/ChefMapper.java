package co.edu.ustavillavo.quiz.mappers;

import org.mapstruct.Mapper;

import co.edu.ustavillavo.quiz.controller.dto.Chef;
import co.edu.ustavillavo.quiz.repository.model.ChefEntity;

@Mapper(componentModel = "spring")
public interface ChefMapper {

    Chef toDto(ChefEntity entity);
    ChefEntity toEntity(Chef chef);
    
}
