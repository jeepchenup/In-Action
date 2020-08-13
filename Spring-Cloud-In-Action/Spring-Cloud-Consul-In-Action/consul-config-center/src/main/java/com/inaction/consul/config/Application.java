package com.inaction.consul.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author pc.chen
 */
@SpringBootApplication
@EnableConfigurationProperties
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
