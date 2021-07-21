package com.rxy.consumer.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate genRestTemp(RestTemplateBuilder builder){
        return builder.build();
    }
}
