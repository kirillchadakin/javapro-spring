package ru.kch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kch.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
