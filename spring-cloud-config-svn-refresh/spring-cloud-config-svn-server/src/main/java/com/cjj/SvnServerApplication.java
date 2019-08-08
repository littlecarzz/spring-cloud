package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/8 14:25
 */
@SpringBootApplication
@EnableConfigServer
public class SvnServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SvnServerApplication.class, args);
    }
}
