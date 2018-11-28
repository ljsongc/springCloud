package com.ljsong.springcloudconsumer.feignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ljsong
 * @date 2018/11/28  12:29
 */
@Component
@FeignClient(name = "hello-Service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello() ;
}
