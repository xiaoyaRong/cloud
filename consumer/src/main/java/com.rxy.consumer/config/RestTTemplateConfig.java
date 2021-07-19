package com.rxy.consumer.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTTemplateConfig {
    @Bean
    public RestTemplate genRestTemp(RestTemplateBuilder builder){
        return builder.build();
    }
}
