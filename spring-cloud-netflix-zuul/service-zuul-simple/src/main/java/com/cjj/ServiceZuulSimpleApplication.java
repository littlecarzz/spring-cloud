package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/12 9:29
 */
@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulSimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulSimpleApplication.class, args);
    }
}
