package com.cjj;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/7 11:21
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam String name) {
        return "hello" +name+" his messge send failed ";
    }
}
