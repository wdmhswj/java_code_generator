package com.yupi.generator;

import com.yupi.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        File parentFile = new File(projectPath).getParentFile();
        System.out.println("parentFile: "+parentFile.getAbsolutePath());
        // 输入路径
        String inputPath = new File(parentFile, "yuzi-generator-demo-projects/acm-template").getAbsolutePath();
        System.out.println("Input Path: " + inputPath);
        // 输出路径
        String outputPath = projectPath;
        System.out.println("Output Path: " + outputPath);
        // 生成静态文件：复制
        StaticGenerator.copyFileByHutool(inputPath, outputPath);
        // 生成动态文件：根据模板生成
        String inputDynamicPath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl"; // 此处 / 也应换为 File.separator

        String outputDynamicPath = outputPath + File.separator + "acm-template/src/com/yupi/acm/MainTemplate.java";

        DynamicGenerator.doGenerate(inputDynamicPath, outputDynamicPath, model);
    }

    public static void main(String[] args) throws IOException, TemplateException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yupi-2");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        doGenerate(mainTemplateConfig);
    }
}
