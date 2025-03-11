package ru.kch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kch.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByUserId(Long userId);
}
