package com.example.smodyhttps.controller;

import com.example.smodyhttps.dto.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public ResponseEntity<HelloResponse> asd() {
        return ResponseEntity.ok(new HelloResponse("hello world"));
    }
}
