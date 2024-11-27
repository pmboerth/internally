package com.internally.backend.controllers;

import com.internally.backend.exceptions.LocationNotFoundException;
import com.internally.backend.models.Location;
import com.internally.backend.repositories.LocationRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationRepository repository;

    public LocationController(LocationRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Location newLocation(@RequestBody Location location) {
        return this.repository.save(location);
    }

    @GetMapping("/{id}")
    public Location getLocation(@PathVariable long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new LocationNotFoundException(id));
    }


}
