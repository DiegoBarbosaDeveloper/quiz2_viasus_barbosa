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
@Table(name = "chef")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ChefEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChef;
    private UserEntity user;
    private String name;
    private String specialization;
    private Byte age;
}
