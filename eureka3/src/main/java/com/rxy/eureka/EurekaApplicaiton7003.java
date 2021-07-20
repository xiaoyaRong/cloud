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
public class EurekaApplicaiton7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicaiton7003.class,args);
    }

}
