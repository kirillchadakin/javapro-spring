package ru.kch.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kch.model.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
}
