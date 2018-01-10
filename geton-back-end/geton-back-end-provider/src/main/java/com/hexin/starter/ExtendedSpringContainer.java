package com.hexin.starter;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.container.Container;
import com.alibaba.dubbo.container.spring.SpringContainer;
import com.hexin.config.DataConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @author shengwen.zhang
 * @createDate 2018-01-10 16:17:17.
 * @description 自定义DUBBO扩展点，更改DUBBO启动方式
 */
public class ExtendedSpringContainer implements Container {
    public static final String DEFAULT_SPRING_PROFILE_ACTIVE = "spring.profiles.active";
    public static final String DEFAULT_PROFILE_ENVIRONMENT = "dev";
    private static final Logger logger = LoggerFactory.getLogger(SpringContainer.class);
    static AnnotationConfigApplicationContext context;
    @Override
    public void start() {
        startupWithJavaConfig();
    }

    @Override
    public void stop() {
        try {
            if (context != null) {
                context.stop();
                context.close();
                context = null;
            }
        } catch (Throwable e) {
            logger.error(e.getMessage(), e);
        }
    }
    private static void startupWithJavaConfig() {
        logger.info("##############################开始启动Spring容器...#################################");
        System.setProperty(DEFAULT_SPRING_PROFILE_ACTIVE, DEFAULT_PROFILE_ENVIRONMENT);
        context = new AnnotationConfigApplicationContext();
        context.register(DataConfig.class);
        context.refresh();
        context.start();
        logger.info("###############################Spring容器已启动...#########################################");
    }
}
