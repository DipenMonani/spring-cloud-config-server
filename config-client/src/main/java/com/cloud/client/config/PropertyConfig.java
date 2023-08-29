package com.cloud.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix = "application")
public class PropertyConfig {
    String userName;
    String url;
    String secretKey;
}
