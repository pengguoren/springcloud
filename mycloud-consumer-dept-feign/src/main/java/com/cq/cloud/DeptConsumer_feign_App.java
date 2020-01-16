package com.cq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cq.cloud"})
public class DeptConsumer_feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign_App.class, args);
    }

}
