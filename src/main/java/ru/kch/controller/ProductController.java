package ru.kch.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kch.model.dto.ProductDto;
import ru.kch.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> findAll() {
        return productService.findAll();
    }

    @GetMapping("/by-user")
    public List<ProductDto> findByUser(@RequestParam("user_id") Long userId) {
        return productService.findByUserId(userId);
    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable Long id) {
        return productService.findById(id).orElseThrow(() -> new RuntimeException("Product with id=%d is not found".formatted(id)));
    }
}
