package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signup(String username, String password) {
        return userRepository.save(new User(username, passwordEncoder.encode(password), "ROLE_USER"));
    }

    public User signupAdmin(String username, String password) {
        return userRepository.save(new User(username, passwordEncoder.encode(password), "ROLE_ADMIN"));
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}