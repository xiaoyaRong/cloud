package com.rxy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author rongxiaoya
 */
@SpringBootApplication
/**
 * 注册中心服务端的启动类
 */
@EnableEurekaServer
public class EurekaApplicaiton7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicaiton7001.class,args);
    }

}
