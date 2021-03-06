package com.cjj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/7 9:39
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + " this is first message";
    }
    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }
    @RequestMapping("/hello/test")
    public String test() {
        return "test01";
    }
}
