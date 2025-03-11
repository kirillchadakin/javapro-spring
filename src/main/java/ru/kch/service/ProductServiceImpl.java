package ru.kch.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kch.model.Product;
import ru.kch.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByUserId(Long userId) {
        return productRepository.findByUserId(userId);
    }

    @Override
    public Optional<Product> findById(Long productId) {
        return productRepository.findById(productId);
    }
}
