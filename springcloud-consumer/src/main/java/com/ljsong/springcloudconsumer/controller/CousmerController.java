package com.ljsong.springcloudconsumer.controller;

import com.ljsong.springcloudconsumer.feignclient.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ljsong
 * @date 2018/11/27  18:33
 */
@RestController
public class CousmerController {
    /**
     * 这里注入的restTemplate就是在SpringcloudConsumerApplication中通过@Bean配置的实例
     */
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    /**
     * 消费方式1：ribbon+restTemplate
     *
     * @return
     */
    @RequestMapping("/hello-consumer-ribbon")
    public String helloConsumer() {
        //调用hello-service服务，注意这里用的是服务名，而不是具体的ip+port
        restTemplate.getForObject("http://hello-service/hello", String.class);
        return "hello consumer finish !!!";
    }


    /**
     * 消费方式2：feign
     *
     * @return
     */
    @RequestMapping("/hello-consumer-feign")
    public String helloConsumer1() {
        return helloService.hello();
    }
}
