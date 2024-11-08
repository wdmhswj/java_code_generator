package com.yupi.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * 静态代码生成器
 */
public class StaticGenerator {
    public static void main(String[] args) {
        // 项目根路径
        String projectPath = System.getProperty("user.dir");
//        System.out.println("Project Path: " + projectPath);
        // 输入路径
        String inputPath = projectPath + File.separator + "yuzi-generator-demo-projects" + File.separator + "acm-template";
//        System.out.println("Input Path: " + inputPath);
        // 输出路径
        String outputPath = projectPath;

        // 复制
        copyFileByHutool(inputPath, outputPath);


    }

    /**
     * 使用 Hutool 工具类复制文件
     * @param inputPath 输入路径
     * @param outputPath 输出路径
     */
    public static void copyFileByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
