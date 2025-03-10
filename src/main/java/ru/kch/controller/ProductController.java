package ru.kch.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kch.model.Product;
import ru.kch.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/by-user")
    public List<Product> findByUser(@RequestParam("user_id") Long userId) {
        return productService.findByUserId(userId);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.findById(id).orElseThrow(() -> new RuntimeException("Product with id=%d is not found".formatted(id)));
    }
}
