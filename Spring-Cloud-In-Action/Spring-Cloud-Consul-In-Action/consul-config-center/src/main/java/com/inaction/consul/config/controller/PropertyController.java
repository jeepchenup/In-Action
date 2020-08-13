package com.inaction.consul.config.controller;

import com.inaction.consul.config.properties.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pc.chen
 */
@RestController
@RequestMapping("/property")
public class PropertyController {
    /**
     * 动态读取配置中心
     */
    @Value("${redisConnections:0}")
    private Integer redisConnections;

    @Autowired
    private RedisProperties redisProperties;

    @GetMapping("/redisProperties")
    public String redisProperties() {
        return redisProperties.toString();
    }
}
