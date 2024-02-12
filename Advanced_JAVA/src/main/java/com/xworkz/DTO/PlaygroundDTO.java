package com.xworkz.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlaygroundDTO {
    private String name;
    private String location;
    private String type;
    private int capacity;
}
