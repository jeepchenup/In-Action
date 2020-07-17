package com.inaction.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nacos服务提供方的接口层
 *
 * @author pc.chen
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/info")
    public String info() {
        return applicationName.concat(":").concat(String.valueOf(serverPort)).concat("\nHello World! From Nacos Provider Server.");
    }
}
