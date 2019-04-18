package com.edu.share.log;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wst
 * @date 2019/4/17 15:53
 */
@RestController
public class LogController {

    @Resource
    private LogService logService;

    @RequestMapping("hi")
    public String hi() {
        return logService.hiService();
    }

    @RequestMapping("hello")
    public String hello(String str) {
        return logService.helloService(str);
    }
}
