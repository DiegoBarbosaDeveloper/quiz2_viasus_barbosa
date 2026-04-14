package co.edu.ustavillavo.quiz.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Chef {
    @NotEmpty
    private User user;
    @NotBlank
    private String name;
    @NotBlank
    private String specialization;
    @Min(value = 18)
    private Integer age;
}
