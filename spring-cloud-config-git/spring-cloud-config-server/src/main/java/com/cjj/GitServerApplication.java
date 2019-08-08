package com.cjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/8 10:38
 */
@SpringBootApplication
@EnableConfigServer
public class GitServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitServerApplication.class, args);
    }
}
