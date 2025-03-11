package ru.kch.model.dto;

public record ProductDto(
        Long id,
        String accountNumber,
        long balance,
        String type,
        Long userId
) {
}
