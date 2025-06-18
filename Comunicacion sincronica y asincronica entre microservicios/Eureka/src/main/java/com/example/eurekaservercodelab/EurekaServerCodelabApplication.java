package com.example.eurekaservercodelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCodelabApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCodelabApplication.class, args);
    }
}
