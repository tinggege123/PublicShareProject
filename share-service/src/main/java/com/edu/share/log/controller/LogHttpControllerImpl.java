package com.edu.share.log.controller;

import com.edu.share.rpc.LogHttpController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author wst
 * @date 2019/4/17 15:15
 */
@Slf4j
@RestController
public class LogHttpControllerImpl implements LogHttpController {

    /**
     * 测试
     *
     * @param str
     * @return
     */
    public String test(String str) {
        log.info("[测试数据开始] {}", str);
        return "测试数据";
    }
}
