package com.internally.backend.controllers;

import org.springframework.web.bind.annotation.*;

import com.internally.backend.models.User;
import com.internally.backend.repositories.UserRepository;
import com.internally.backend.exceptions.UserNotFoundException;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping
    User postUser(@RequestBody User user) {
        return this.repository.save(user);
    }

    @GetMapping("/{id}")
    User getUser(@PathVariable Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new UserNotFoundException(id));
    }
}
