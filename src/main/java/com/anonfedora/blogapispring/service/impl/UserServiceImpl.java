package com.anonfedora.blogapispring.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anonfedora.blogapispring.model.User;
import com.anonfedora.blogapispring.repository.UserRepository;
import com.anonfedora.blogapispring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User updateUser(UUID userId, User userDetails) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException());
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setIsVerified(userDetails.getIsVerified());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(UUID userId) {
        userRepository.deleteById(userId);
    }

}
