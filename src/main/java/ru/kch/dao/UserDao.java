package ru.kch.dao;

import ru.kch.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void update(User user);
    void deleteById(Long id);
}
