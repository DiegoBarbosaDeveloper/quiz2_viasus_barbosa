package co.edu.ustavillavo.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ustavillavo.quiz.repository.model.KitchenEntity;

@Repository
public interface KitchenRepository extends JpaRepository<KitchenEntity, Long> {
    boolean existsByRestaurantName(String restaurantName);
}
