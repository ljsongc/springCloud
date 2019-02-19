package com.ljsong.springcloudprovide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author ljsong
 * @date 2018/11/27  17:46
 */
@RestController
public class HelloController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL = "SELECT SYS_DOCUMENTID FROM dom_332_doclib WHERE  SYS_LASTMODIFIED > '2019-1-17'";

    @RequestMapping("/hello")
    public String hello() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        //打印服务的服务id
        System.out.println("***************"+instance.getServiceId());
        List<Map<String, Object>> maps =  jdbcTemplate.queryForList(SQL);
        return "hello,this is hello-service";
    }
}
