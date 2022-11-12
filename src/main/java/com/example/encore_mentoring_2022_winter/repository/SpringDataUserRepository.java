package com.example.encore_mentoring_2022_winter.repository;

import com.example.encore_mentoring_2022_winter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUserRepository extends JpaRepository<User, Long>, UserRepository {
}