package com.shenjun.conserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
@EnableEurekaClient
public class ConserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConserverApplication.class, args);
    }

}
