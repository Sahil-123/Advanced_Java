package com.xworkz.service;

import com.xworkz.dto.ProductDto;
import com.xworkz.repository.ProductRepository;
import com.xworkz.requestDto.RequestProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean save(RequestProductDto requestProductDto) {
        System.out.println("service saving process is initiated.");
        ProductDto productDto=new ProductDto(
                requestProductDto.getName(),
                requestProductDto.getDescription(),
                requestProductDto.getUnitPrice(),
                requestProductDto.getCurrentStock()
        );

        return productRepository.save(productDto);
    }

    @Override
    public Optional<ProductDto> findById(int id) {
        System.out.println("service find process is initiated.");

        return productRepository.findById(id);
    }
}
