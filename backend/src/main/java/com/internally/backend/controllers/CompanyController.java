package com.internally.backend.controllers;


import com.internally.backend.exceptions.CompanyNotFoundException;
import com.internally.backend.models.Company;
import com.internally.backend.repositories.CompanyRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyRepository repository;

    public CompanyController(CompanyRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Company newCompany(@RequestBody Company company) {
        return this.repository.save(company);
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));
    }
}
