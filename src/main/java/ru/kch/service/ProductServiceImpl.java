package ru.kch.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kch.model.EntityToDtoProductMapper;
import ru.kch.model.dto.ProductDto;
import ru.kch.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final EntityToDtoProductMapper mapper;

    @Override
    public List<ProductDto> findAll() {
        return productRepository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public List<ProductDto> findByUserId(Long userId) {
        return productRepository.findByUserId(userId).stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public Optional<ProductDto> findById(Long productId) {
        return productRepository.findById(productId)
                .map(mapper::toDto);
    }
}
