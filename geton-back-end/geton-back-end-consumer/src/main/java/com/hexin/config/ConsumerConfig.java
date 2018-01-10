package com.hexin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author shengwen.zhang
 * @createDate 2017-12-11 18:15:27.
 * @description
 */
@Configuration
@ComponentScan("com.hexin")
@ImportResource("classpath:/dubbo-consumer.xml")
public class ConsumerConfig {

}
