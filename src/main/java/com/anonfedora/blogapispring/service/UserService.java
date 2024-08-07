package com.anonfedora.blogapispring.service;

import java.util.Optional;
import java.util.UUID;

import com.anonfedora.blogapispring.model.User;

public interface UserService {
    User registerUser(User user);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUserByUsername(String username);

    User updateUser(UUID userId, User userDetails);

    void deleteUser(UUID userId);
}
