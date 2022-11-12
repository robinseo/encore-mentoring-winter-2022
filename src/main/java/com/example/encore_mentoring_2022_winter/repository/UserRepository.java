package com.example.encore_mentoring_2022_winter.repository;

import com.example.encore_mentoring_2022_winter.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    List<User> findAll();
}
