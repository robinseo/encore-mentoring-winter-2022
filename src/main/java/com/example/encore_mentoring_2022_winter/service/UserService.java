package com.example.encore_mentoring_2022_winter.service;

import com.example.encore_mentoring_2022_winter.entity.User;
import com.example.encore_mentoring_2022_winter.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);
        return user.getId();
    }

    public Optional<User> findOne(Long userId) {
        return userRepository.findById(userId);
    }

    private void validateDuplicateUser(User user) {
        userRepository.findByEmail(user.getEmail())
                .ifPresent(u -> {
                    throw new IllegalStateException("Already Signed In with Email");
                });
    }


}
