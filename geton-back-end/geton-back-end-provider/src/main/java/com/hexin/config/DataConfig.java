package com.hexin.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author shengwen.zhang
 * @createDate 2017-12-05 18:10:37.
 * @description
 */
@Configuration
//@ComponentScan(basePackages = {"com.hexin"})
@MapperScan("com.hexin")
@Import({DataSourceFromGetOn.class})
@ImportResource("classpath:/dubbo-provider.xml")
public class DataConfig {

    @Bean
    public SqlSessionFactoryBean sessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        Resource configLocationResource = new ClassPathResource("/mybatis/mybatis-config/mybatis-config.xml");
        sessionFactoryBean.setConfigLocation(configLocationResource);
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] mapperResources = resourcePatternResolver.getResources("classpath*:mybatis/mapper/**/*Mapper.xml");
        sessionFactoryBean.setMapperLocations(mapperResources);
        return sessionFactoryBean;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sessionFactory");
        mapperScannerConfigurer.setBasePackage("com.hexin.**.repository");
        return mapperScannerConfigurer;
    }

}
