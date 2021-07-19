package com.rxy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //注册中心服务端的启动类
public class EurekaApplicaiton {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicaiton.class,args);
    }

}
