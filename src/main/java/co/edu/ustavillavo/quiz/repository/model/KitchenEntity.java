package co.edu.ustavillavo.quiz.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kitchen")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class KitchenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKitchen;

    private String restauranName;

    private ChefEntity chef;

    private Long capacity;
}
