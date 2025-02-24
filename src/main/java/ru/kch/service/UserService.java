package ru.kch.service;

import ru.kch.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void createUser(User user);
    void deleteUser(User user);
    Optional<User> findUserById(Long id);
    List<User> findAll();
}
