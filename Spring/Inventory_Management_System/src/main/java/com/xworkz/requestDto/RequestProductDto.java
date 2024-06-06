package com.xworkz.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Component
@Data // Combines @Getter, @Setter, @EqualsAndHashCode, and @ToString
@AllArgsConstructor
public class RequestProductDto {

  @NotBlank(message = "Name is mandatory")
  private String name;

  private String description;

  @NotNull(message = "Unit price cannot be null")
  @Positive(message = "Unit price must be positive")
  private BigDecimal unitPrice;

  @NotNull(message = "Current stock cannot be null")
  @Positive(message = "Current stock must be positive")
  private Integer currentStock;

  public RequestProductDto(){
    System.out.println("RequestProductDto object is created.");
  }
}
