package com.internally.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internally.backend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {}
