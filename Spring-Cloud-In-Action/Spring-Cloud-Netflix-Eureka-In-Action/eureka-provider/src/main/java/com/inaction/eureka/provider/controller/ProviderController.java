package com.inaction.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pc.chen
 */
@RestController
@RequestMapping("/eureka")
public class ProviderController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/info")
    public String info() {
        return applicationName.concat(":").concat(serverPort);
    }
}
