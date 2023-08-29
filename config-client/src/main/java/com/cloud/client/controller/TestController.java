package com.cloud.client.controller;

import com.cloud.client.config.PropertyConfig;
import com.cloud.client.dto.PropertyDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    PropertyConfig propertyConfig;
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/property")
    public ResponseEntity<PropertyDTO> getProperties() {
        return ResponseEntity.ok().body(PropertyDTO.builder()
                        .userName(propertyConfig.getUserName())
                        .secretKey(propertyConfig.getSecretKey())
                        .url(propertyConfig.getUrl())
                .build());
    }
}
