package com.example.encore_mentoring_2022_winter.service;

import com.example.encore_mentoring_2022_winter.entity.User;
import com.example.encore_mentoring_2022_winter.repository.SpringDataUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Autowired
    SpringDataUserRepository userRepository;

    @Test
    void join() {
        User user = new User();
        user.setName("Robin");
        user.setEmail("robin@test.com");
        user.setPassword("myAwesomePassword");

        Long userId = userService.join(user);
        User foundUser = userService.findOne(userId).get();

        Assertions.assertThat(user.getName()).isEqualTo(foundUser.getName());
    }
}
