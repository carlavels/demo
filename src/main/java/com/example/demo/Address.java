package com.example.demo;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    
    private Integer street;
    private String city;
    private String  country;


    public static Address buildOne() {
        return Address.builder()
        .street(10)
        .city("Super City")
        .country("Super Country")
        .build();
    }
}
