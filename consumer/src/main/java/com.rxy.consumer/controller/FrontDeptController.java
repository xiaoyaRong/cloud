package com.rxy.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("front/")
public class FrontDeptController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("list")
    public String list(){
        String s = restTemplate.postForObject("http://localhost:8001/dept/list", null, String.class);
        return s;
    }


}
