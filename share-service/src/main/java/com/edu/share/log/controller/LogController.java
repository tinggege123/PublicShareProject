package com.edu.share.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author wst
 * @date 2019/4/17 15:15
 */
@Slf4j
@RestController
public class LogController {

    @RequestMapping("test")
    @ResponseBody
    public String test(String str) {
        log.info("[测试数据开始]");
        return "测试数据";
    }
}
