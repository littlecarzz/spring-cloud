package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/12 14:12
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ServiceZuulFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulFilterApplication.class, args);
    }

}
