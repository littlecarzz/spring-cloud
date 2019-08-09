package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/9 14:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientBusApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBusApplication.class, args);
    }
}
