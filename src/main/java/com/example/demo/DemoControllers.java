package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoControllers {
    

    @GetMapping("/get-one")
    public ResponseEntity<?> getOne() {
        return ResponseEntity.ok(OneDTO.buildOne());
    }

    @GetMapping("/get-two")
    public ResponseEntity<?> getTwo() {
        return ResponseEntity.ok(TwoDTO.buildOne());
    }
}
