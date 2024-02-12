package com.xworkz.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class WatchDTO {
    private String brand;
    private double price;
    private long size;
    private String type;
}
