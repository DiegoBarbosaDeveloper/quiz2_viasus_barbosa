package co.edu.ustavillavo.quiz.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Chef {
    @Min(value = 1)
    private Long userId;
    @NotBlank
    private String name;
    @NotBlank
    private String specialization;
    @Min(value = 18)
    private Integer age;
}
