package com.inaction.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 服务器端
 * 相比较Consul、Nacos、Zookeeper需要创建一个独立的工程进行打包，然后再启动
 * 而其他几种服务注册工具，是官方直接帮我们打包好的
 *
 * @author pc.chen
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
