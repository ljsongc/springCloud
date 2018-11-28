package com.ljsong.springcloudprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
public class SpringcloudProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvideApplication.class, args);
    }
}
