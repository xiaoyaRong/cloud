package com.rxy.provider;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动后自动注册到eureka中
@EnableDiscoveryClient
@EnableCircuitBreaker //打开熔断器
public class HystrixProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixProviderApplication.class,args);
    }
}
