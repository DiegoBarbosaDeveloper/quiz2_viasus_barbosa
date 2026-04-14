package co.edu.ustavillavo.quiz.mappers;

import org.mapstruct.Mapper;

import co.edu.ustavillavo.quiz.controller.dto.Kitchen;
import co.edu.ustavillavo.quiz.repository.model.KitchenEntity;

@Mapper(componentModel = "spring")
public interface KitchenMapper {
    
    Kitchen toDto(KitchenEntity kitchenEntity);
    KitchenEntity toEntity(Kitchen kitchen);
}
