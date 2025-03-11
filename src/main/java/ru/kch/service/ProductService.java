package ru.kch.service;

import ru.kch.model.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDto> findAll();
    List<ProductDto> findByUserId(Long userId);
    Optional<ProductDto> findById(Long productId);
}
