package com.internally.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.internally.backend.models.User;

public interface UserRepository extends CrudRepository<User, Long> {}
