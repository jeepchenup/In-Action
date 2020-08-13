package com.inaction.consul.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pc.chen
 */
@FeignClient("consul-provider-app")
public interface ProviderService {

    /**
     * 查询服务提供方的信息
     *
     * @return
     */
    @GetMapping("/consul/info")
    String info();
}
