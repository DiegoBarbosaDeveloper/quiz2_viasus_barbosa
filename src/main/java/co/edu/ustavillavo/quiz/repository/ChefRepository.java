package co.edu.ustavillavo.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ustavillavo.quiz.repository.model.ChefEntity;

@Repository
public interface ChefRepository extends JpaRepository<ChefEntity, Long> {
    
}
