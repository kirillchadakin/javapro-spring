package ru.kch.model;

import org.mapstruct.Mapper;
import ru.kch.model.dto.ProductDto;
import ru.kch.model.entity.Product;

@Mapper(componentModel = "spring")
public interface EntityToDtoProductMapper {
    ProductDto toDto(Product entity);
}
