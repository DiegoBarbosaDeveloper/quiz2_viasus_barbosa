package co.edu.ustavillavo.quiz.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ustavillavo.quiz.controller.dto.Chef;
import co.edu.ustavillavo.quiz.mappers.ChefMapper;
import co.edu.ustavillavo.quiz.repository.ChefRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ChefService {
    
    private final ChefRepository chefRepository;

    private final ChefMapper chefMapper;

    public List<Chef> getAllChef(){
        return chefRepository.findAll()
            .stream()
            .map(chefMapper::toDto)
            .toList();
    }

    public Chef saveChef(@NonNull Chef request){
        return chefMapper.toDto(chefRepository.save(chefMapper.toEntity(request)));
    }

    public Chef getChef(@NonNull Long id){
        return chefMapper.toDto(chefRepository.findById(id).orElseThrow(()-> new RuntimeException("Chef Not Found")));
    }

    public Chef updateChef(@NonNull Chef request){

        if (!chefRepository.existsByName(request.getName())){
            throw new RuntimeException(
                "Chef Not Foudn for Update"
            );
        }

        return chefMapper.toDto(chefRepository.save(chefMapper.toEntity(request)));
    }

    public void deleteChef(@NonNull Long id){
        chefRepository.delete(chefRepository.getReferenceById(id));
    }

    
}
