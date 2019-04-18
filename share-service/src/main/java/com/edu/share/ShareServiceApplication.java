package com.edu.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShareServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShareServiceApplication.class, args);
    }

}

