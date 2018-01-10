package com.hexin.config;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * @author shengwen.zhang
 * @createDate 2017-12-04 18:27:00.
 * @description
 */
@Configuration
@Profile("dev")
@EnableTransactionManagement(proxyTargetClass=true, mode = AdviceMode.ASPECTJ)
@PropertySource("classpath:/configProperties/application.properties")
public class DataSourceFromGetOn implements TransactionManagementConfigurer {
    private final static Logger logger = LoggerFactory.getLogger(DataSourceFromGetOn.class);

    @Bean
    public HikariDataSource dataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setReadOnly(false);
        dataSource.setConnectionTimeout(connectionTimeout);
        dataSource.setIdleTimeout(idleTimeout);
        dataSource.setMaxLifetime(maxLifetime);
        dataSource.setMaximumPoolSize(maxPoolSize);
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return transactionManager(dataSource());
    }


    @PostConstruct
    public void init(){
        logger.info("开始初始化DataSource");
    }
    @PreDestroy
    public void destroy(){
        logger.info("开始销毁DataSource实例");
        dataSource().close();
    }
    // 优雅的姿势：可以用spring boot的
    // @EnableConfigurationProperties 和 @ConfigurationProperties 配置数据库连接池
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.connectionTimeout}")
    private long connectionTimeout;
    @Value("${jdbc.idleTimeout}")
    private long idleTimeout;
    @Value("${jdbc.maxLifetime}")
    private long maxLifetime;
    @Value("${jdbc.maxPoolSize}")
    private int maxPoolSize;
}
