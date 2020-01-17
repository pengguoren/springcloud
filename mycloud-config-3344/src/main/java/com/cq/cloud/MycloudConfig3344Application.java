package com.cq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MycloudConfig3344Application {

    public static void main(String[] args) {
        SpringApplication.run(MycloudConfig3344Application.class, args);
    }

}
