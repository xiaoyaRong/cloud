package com.rxy.consumer.controller;


import com.netflix.discovery.converters.Auto;
import com.rxy.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**常规httpurl*/
   //private static final String url = "http://localhost:8001/";
   /**使用ribbon负载均衡 不需要 关心端口号和ip,直接使用提供者在eureka中注册的名称进行调用*/
   //private static final String url = "http://PROVIDER";
   /**使用feign调用*/
   @Autowired
   private DeptFeignService deptFeignService = null;

    @GetMapping("list")
    public String list(){
        String s = deptFeignService.list();
        //String s = restTemplate.postForObject(url + "/dept/list", null, String.class);
        return s;
    }
    @GetMapping("who")
    public String who(){
        String s = deptFeignService.who();
        //String s = restTemplate.postForObject(url + "/dept/who", null, String.class);
        return s;
    }
    @GetMapping("one/{id}")
    public String who(@PathVariable("id") Integer id){
        String s = deptFeignService.getOne(id);
        //String s = restTemplate.postForObject(url + "/dept/who", null, String.class);
        return s;
    }


}
