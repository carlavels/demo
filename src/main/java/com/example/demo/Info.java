package com.example.demo;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    
    private Address address;
    private String sex;
    private String[] aliases;

    public static Info buildOne() {
        return Info.builder()
        .address(Address.buildOne())
        .sex("M")
        .aliases(new String[]{"aliasOne", "aliasTwo", "alias3"})
        .build();
    }
}
