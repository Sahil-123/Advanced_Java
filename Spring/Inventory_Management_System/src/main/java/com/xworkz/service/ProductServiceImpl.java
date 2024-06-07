package com.xworkz.service;

import com.xworkz.dto.ProductDto;
import com.xworkz.repository.ProductRepository;
import com.xworkz.requestDto.RequestProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Optional<ProductDto> findById(Integer id) {

        if (id < 0) {
            // Handle validation error
            throw new IllegalArgumentException("Item Id should not negative");
        }

        System.out.println("service find process is initiated : "+id);
        return productRepository.findById(id);
    }

    @Override
    public Optional<List<ProductDto>> findByCurrentStock(Integer currentStock) {
        System.out.println("Service find by current stock process initiated.");

        if(currentStock==null ||  currentStock < 0){
            throw new IllegalArgumentException("Current Stock should not be negative or empty");
        }

        return productRepository.findByCurentStock(currentStock);
    }
}
