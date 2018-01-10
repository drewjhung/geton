package com.hexin;

import com.hexin.config.DataConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shengwen.zhang
 * @createDate 2017-11-22 18:32:15.
 * @description
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        startupByJavaConfig();
    }
    public static void startupByXML() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:/applicationContext.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
    public static void startupByJavaConfig() throws Exception {
        System.setProperty("spring.profiles.active", "dev");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DataConfig.class);
        context.refresh();
        context.start();
        System.in.read();
    }

}
