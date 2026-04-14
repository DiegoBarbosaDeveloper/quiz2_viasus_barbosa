package co.edu.ustavillavo.quiz.controller.dto;

import co.edu.ustavillavo.quiz.enums.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class User {
    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    private Role role;
}
