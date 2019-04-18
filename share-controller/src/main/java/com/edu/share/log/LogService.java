package com.edu.share.log;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wst
 * @date 2019/4/17 15:54
 */
@Service
public class LogService {

    @Resource
    private RestTemplate restTemplate;

    /**
     * 熔断错误回调方法
     *
     * @return
     */
    public String helloFallBack() {
        return "Error occurred!";
    }

    /**
     * 方法调用
     *
     * @return
     */
    @HystrixCommand(defaultFallback = "helloFallBack")
    public String helloService() {
        return restTemplate.getForObject("http://share-service/test", String.class);
    }
}
