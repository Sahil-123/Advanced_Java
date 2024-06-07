package com.xworkz.repository;

import com.xworkz.dto.ProductDto;
import com.xworkz.requestDto.RequestProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    public boolean save(ProductDto productDto);

    default public Optional<ProductDto> findById(int id){
        return Optional.empty();
    }

    default public Optional<List<ProductDto>> findByCurentStock(int currentStok){
        return Optional.empty();
    }

}
