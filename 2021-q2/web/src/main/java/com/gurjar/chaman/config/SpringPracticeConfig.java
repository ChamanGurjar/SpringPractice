package com.gurjar.chaman.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/




@SpringBootApplication
@ComponentScan(basePackages  = {"com.gurjar.chaman"})
@PropertySource(value = "file:{user.home}/config/spring_practice_override.properties")
public class SpringPracticeConfig {

}
