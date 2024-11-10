package com.yupi.model;

import lombok.Data;

/**
 * 动态模板配置
 */
@Data // Lombok 注解，自动生成 getter、setter、toString 方法
public class MainTemplateConfig {
    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注射
     */
    private String author = "yupi";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
