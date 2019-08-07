package com.cjj;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：
 *
 * @author littlecar
 * @date 2019/8/7 10:06
 */
@FeignClient(name = "spring-cloud-provider",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name);
}
