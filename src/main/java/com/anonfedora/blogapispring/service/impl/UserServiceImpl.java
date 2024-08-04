package com.anonfedora.blogapispring.service.impl;

import java.util.Optional;
import java.util.UUID;

import com.anonfedora.blogapispring.model.User;
import com.anonfedora.blogapispring.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User registerUser(User user) {

        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }

    @Override
    public User login(User user) {

        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public Optional<User> findUserByEmail(String email) {

        throw new UnsupportedOperationException("Unimplemented method 'findUserByEmail'");
    }

    @Override
    public Optional<User> findUserByUsername(String username) {

        throw new UnsupportedOperationException("Unimplemented method 'findUserByUsername'");
    }

    @Override
    public User updateUser(UUID userId, User userDetails) {

        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(UUID userId) {

        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
