package com.ljsong.springcloudprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.UUID;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableCaching
@EnableEurekaClient
public class SpringcloudProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvideApplication.class, args);
    }
}
