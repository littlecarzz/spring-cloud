package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/7 17:09
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerNode1Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerNode1Application.class, args);
    }
}
