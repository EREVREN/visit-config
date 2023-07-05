package com.project.visitconfig.db;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
@Getter
@Setter
public class DbSettings {
    
    private Map<String, String> connection;
    private String host;
    private int port;

    
}
