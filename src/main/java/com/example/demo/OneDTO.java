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
public class OneDTO {

    private String firstName;
    private String lastName;
    private String age;
    private Info info;
    private String education;
    private String job;

    public static OneDTO buildOne() {
        return OneDTO.builder()
        .firstName("SuperFirstName")
        .lastName("SuperLastName")
        .age("22")
        .info(Info.buildOne())
        .education("PUP")
        .job("Cleaner")
        .build();
    }
}
