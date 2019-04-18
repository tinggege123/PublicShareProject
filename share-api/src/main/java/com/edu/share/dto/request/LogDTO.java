package com.edu.share.dto.request;

import lombok.*;

/**
 * 日志传输类
 *
 * @author wst
 * @date 2019/4/18 10:07
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LogDTO {

    /**
     * id主键
     */
    private Long id;

    /**
     * 名字
     */
    private String name;

}
