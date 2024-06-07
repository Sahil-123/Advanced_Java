package com.xworkz.service;

import com.xworkz.dto.ProductDto;
import com.xworkz.requestDto.RequestProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public boolean save(RequestProductDto requestProductDto);

    public Optional<ProductDto> findById(Integer id);

    public Optional<List<ProductDto>> findByCurrentStock(Integer currentStock);

}
