package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述：
 *SpringCloudEurekaApplication 启动类
 * @author littlecar
 * @date 2019/8/6 14:47
 */
@SpringBootApplication
//启动eureka server
@EnableEurekaServer
public class SpringCloudEurekaApplication{
    public static void main(String[] arg) {
        SpringApplication.run(SpringCloudEurekaApplication.class);
    }
}
