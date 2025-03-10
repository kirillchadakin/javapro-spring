package ru.kch.service;

import ru.kch.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    List<Product> findByUserId(Long userId);
    Optional<Product> findById(Long productId);
}
