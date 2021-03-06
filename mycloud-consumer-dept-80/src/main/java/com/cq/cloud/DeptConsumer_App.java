package com.cq.cloud;

import com.cq.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 彭国仁
 * @data 2020/1/15 13:58
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MYCLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App.class,args);
    }
}
