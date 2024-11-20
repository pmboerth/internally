package com.internally.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.internally.backend.models.User;
import com.internally.backend.repositories.UserRepository;
import com.internally.backend.exceptions.UserNotFoundException;

@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/users")
    User postUser(@RequestBody User u) {
        return this.repository.save(u);
    }

    @GetMapping("/users/{id}")
    User getUser(@PathVariable Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new UserNotFoundException(id));
    }
}
