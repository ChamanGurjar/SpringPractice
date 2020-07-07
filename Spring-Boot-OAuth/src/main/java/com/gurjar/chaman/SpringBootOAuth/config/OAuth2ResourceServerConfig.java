package com.gurjar.chaman.SpringBootOAuth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @Author: Chaman Gurjar
 * @Date : 07-Jul-2020
 */

@Configuration
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/api/**").authenticated()
                .antMatchers("/").permitAll();

        /*
          Above config enable protection on all endpoints starting /api.
          All other endpoints are not secure and accessible without OAuth security.
         */

    }
}
