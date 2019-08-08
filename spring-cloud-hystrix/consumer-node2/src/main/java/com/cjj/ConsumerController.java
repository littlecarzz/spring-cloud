package com.cjj;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/7 10:09
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "fall")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }

    public String fall() {
        return "false";
    }
}

