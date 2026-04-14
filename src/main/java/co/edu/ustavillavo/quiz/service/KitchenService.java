package co.edu.ustavillavo.quiz.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ustavillavo.quiz.controller.dto.Kitchen;
import co.edu.ustavillavo.quiz.mappers.KitchenMapper;
import co.edu.ustavillavo.quiz.repository.KitchenRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

@Service
@RequiredArgsConstructor
@Transactional
public class KitchenService {
    
    private final KitchenRepository kitchenRepository;

    private final KitchenMapper kitchenMapper;

    public List<Kitchen> getAll(){
        return kitchenRepository.findAll()
            .stream()
            .map(kitchenMapper::toDto)
            .toList();
    }

    public Kitchen getKitchen(@NonFinal Long id){
        return kitchenMapper.toDto(kitchenRepository.findById(id).orElseThrow(()-> new RuntimeException("Kitchen Not Found")));
    }

    public Kitchen updateKitchen(@NonNull Kitchen kitchen){

        if (!kitchenRepository.existsByRestaurantName(kitchen.getRestaurantName())){
            throw new RuntimeException("Kitchen Not Found");
        }
        return kitchenMapper.toDto(kitchenRepository.save(kitchenMapper.toEntity(kitchen)));
    }

    public void deleteKitchen(@NonNull Long id){
        kitchenRepository.deleteById(id);
    }
}


