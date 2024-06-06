package com.xworkz.dto;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "Products")
@NamedQuery(name = "findById", query = "select product from ProductDto product where product.productId = :productId")
public class ProductDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private Long productId;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "unit_price")
  private BigDecimal unitPrice;

  @Column(name = "current_stock")
  private Integer currentStock;

  public ProductDto(){
    System.out.println("ProductDto object is created.");
  }

  public ProductDto(String name, String description, BigDecimal unitPrice, Integer currentStock) {
    this.name = name;
    this.description = description;
    this.unitPrice = unitPrice;
    this.currentStock = currentStock;
  }
}
