package com.gurjar.chaman.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

@SpringBootApplication
@ComponentScan(basePackages  = {"com.gurjar.chaman"})
@EntityScan(basePackages = {"com.gurjar.chaman.model.entity"})
@EnableJpaRepositories(basePackages = {"com.gurjar.chaman.repository"})
@PropertySource(value = "file:{user.home}/config/spring_practice_override.properties")
public class SpringPracticeConfig {

}
