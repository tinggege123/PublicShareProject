package com.edu.share.rpc.error;

import com.edu.share.rpc.LogHttpController;
import org.springframework.stereotype.Component;

/**
 * 日志异常类
 *
 * @author wst
 * @date 2019/4/18 11:47
 */
@Component
public class LogHttpErrorController implements LogHttpController {

    /**
     * 错误日志
     *
     * @param str 打印字符串
     * @return
     */
    public String test(String str) {
        return "错误日志";
    }
}
