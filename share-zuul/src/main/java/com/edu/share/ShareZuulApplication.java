package com.edu.share;

import com.edu.share.configuration.ShareFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


/**
 * 目前zuul的2.1.0版本没有集成，我去官网找集成的方法都没有找到,先集成2.0.6的
 *
 * @author wst
 */
@SpringBootApplication
@EnableZuulProxy
public class ShareZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShareZuulApplication.class, args);
    }

    @Bean
    public ShareFilter shareFilter() {
        return new ShareFilter();
    }

}

