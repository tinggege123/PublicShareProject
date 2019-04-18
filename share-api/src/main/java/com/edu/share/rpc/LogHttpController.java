package com.edu.share.rpc;

import com.edu.share.rpc.error.LogHttpErrorController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 日志Http调用接口
 *
 * @author wst
 * @date 2019/4/18 10:06
 */
@FeignClient(name = "share-service",fallback = LogHttpErrorController.class)
public interface LogHttpController {

    /**
     * 测试用例
     *
     * @param str 打印字符串
     * @return 响应字符串
     */
    @RequestMapping(value = "/now/data/test")
    String test(@RequestParam("str") String str);
}
