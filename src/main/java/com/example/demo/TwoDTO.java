package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TwoDTO {
    
    private String firstName;
    private String lastName;
    private String age;
    
    private Address address;
    private String sex;
    private String[] aliases;

    public static TwoDTO buildOne() {
        return TwoDTO.builder()
        .firstName("SuperFirstName")
        .lastName("SuperLastName")
        .age("22")
        .address(Address.buildOne())
        .sex("M")
        .aliases(new String[]{"aliasOne", "aliasTwo", "alias3"})
        .build();
    }
}
