package com.rxy.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author rongxiaoya
 */
@RestController
@RequestMapping("front/")
public class FrontDeptController {

    @Autowired
    private RestTemplate restTemplate;

   //private static final String url = "http://localhost:8001/";
   //使用ribbon负载均衡 不需要 关心端口号和ip,直接使用提供者在eureka中注册的名称进行调用
   private static final String url = "http://PROVIDER";

    @GetMapping("list")
    public String list(){
        String s = restTemplate.postForObject(url + "/dept/list", null, String.class);
        return s;
    }
    @GetMapping("who")
    public String who(){
        String s = restTemplate.postForObject(url + "/dept/who", null, String.class);
        return s;
    }


}
