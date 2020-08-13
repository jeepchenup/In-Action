package com.inaction.consul.consumer.controller;

import com.inaction.consul.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pc.chen
 */
@RestController
@RequestMapping("/consul")
public class ConsumerController {

    @Value("${consul-provider-info-url}")
    private String providerInfoUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProviderService providerService;

    @GetMapping("/info")
    public String info() {
        return restTemplate.getForObject(providerInfoUrl, String.class);
    }

    @GetMapping("/feign/info")
    public String feignInfo() {
        return providerService.info();
    }

    @GetMapping("/showAllServices")
    public Map showAllServices() {
        Map<String, Object> result = new HashMap<>();
        List<String> serviceIds = discoveryClient.getServices();
        result.put("serviceIds", serviceIds);
        List serviceInfo = new ArrayList();
        serviceIds.forEach(serviceId -> {
            serviceInfo.addAll(discoveryClient.getInstances(serviceId));
        });
        result.put("serviceInfo", serviceInfo);
        return result;
    }
}
