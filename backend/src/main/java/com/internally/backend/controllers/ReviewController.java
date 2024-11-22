package com.internally.backend.controllers;

import com.internally.backend.exceptions.ReviewNotFoundException;
import com.internally.backend.models.Review;
import com.internally.backend.repositories.ReviewRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewRepository repository;

    ReviewController(ReviewRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    Review postReview(@RequestBody Review review) {
        return this.repository.save(review);
    }

    @GetMapping("/{id}")
    Review getReview(@PathVariable Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new ReviewNotFoundException(id));
    }


}
