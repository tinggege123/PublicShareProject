package com.edu.share.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 日志Http调用接口
 *
 * @author wst
 * @date 2019/4/18 10:06
 */
@FeignClient(name = "share-service")
public interface LogHttpController {

    /**
     * 测试用例
     *
     * @return 测试字符串
     */
    @RequestMapping(value = "/data/test")
    String test(@RequestParam("str") String str);
}
