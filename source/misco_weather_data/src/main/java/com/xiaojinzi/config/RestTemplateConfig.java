package com.xiaojinzi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */
@Configuration
public class RestTemplateConfig {

    @Autowired
    private RestTemplateBuilder templateBuilder;

    @Bean
    public RestTemplate restTemplate(){
        return templateBuilder.build();
    }


}
