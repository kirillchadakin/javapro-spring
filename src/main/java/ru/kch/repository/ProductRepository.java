package ru.kch.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kch.model.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByUserId(Long userId);
}
