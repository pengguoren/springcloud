package com.cq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Mycloud_Zuul_Gateway_9527_app {

    public static void main(String[] args) {
        SpringApplication.run(Mycloud_Zuul_Gateway_9527_app.class, args);
    }

}
