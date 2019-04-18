package com.edu.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wst
 * @desc Eureka注册中心项目启动类
 * @date 2019/4/17 14:51
 */
@SpringBootApplication
@EnableEurekaServer
public class ShareEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShareEurekaApplication.class, args);
    }
}
