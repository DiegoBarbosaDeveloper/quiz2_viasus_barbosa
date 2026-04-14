package co.edu.ustavillavo.quiz.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Kitchen {

    @NotBlank
    private String restaurantName;

    @Min(value = 1)
    private Long ChefId;

    @Min(value = 1)
    private Long Capacity;
}
