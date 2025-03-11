package ru.kch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kch.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
