package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/13 16:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayEurekaApplication.class, args);
    }

}
