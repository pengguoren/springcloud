package com.cq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsueu_hysrix_dashboard_9001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsueu_hysrix_dashboard_9001_App.class, args);
    }

}
