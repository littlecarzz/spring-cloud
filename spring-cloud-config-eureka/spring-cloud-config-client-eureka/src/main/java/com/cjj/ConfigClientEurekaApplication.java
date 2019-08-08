package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/8 17:20
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
    }
}
