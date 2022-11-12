package com.example.encore_mentoring_2022_winter;

import com.example.encore_mentoring_2022_winter.repository.SpringDataUserRepository;
import com.example.encore_mentoring_2022_winter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    private final UserRepository userRepository;

    @Autowired
    public ApplicationConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
