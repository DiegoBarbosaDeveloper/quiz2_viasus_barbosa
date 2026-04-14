package co.edu.ustavillavo.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ustavillavo.quiz.controller.dto.User;
import co.edu.ustavillavo.quiz.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;
    
    @GetMapping("/{id}")
    public User getUser(@NonNull @PathVariable Long id){
        return userService.findById(id);
    }


    @PostMapping
    public User saveUser(@NonNull @RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping
    public User updateUser(@NonNull @RequestBody User user){
        return userService.updateUser(user);
    }

}
