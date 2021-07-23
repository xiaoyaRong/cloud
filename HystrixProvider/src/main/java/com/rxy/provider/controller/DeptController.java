package com.rxy.provider.controller;

import com.alibaba.fastjson.JSON;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rxy.entity.Dept;
import com.rxy.provider.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author rongxiaoya
 */
@RestController
@RequestMapping("dept/")
@Slf4j
public class DeptController {
    @Autowired
    private IDeptService deptService;

    @RequestMapping("list")
    public String getList(){
        log.info("provider1");
        return JSON.toJSONString(deptService.selectList());
    }

    @RequestMapping("who")
    public String who(){
        return "provider1";
    }

    @RequestMapping("one/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGetOne")
    public String getOne(@PathVariable("id")Integer id){
        Dept dept = deptService.selectOne(id);
        if(Objects.isNull(dept)){
            throw new RuntimeException("部门不存在");
        }
        return JSON.toJSONString(dept);
    }

    public String hystrixGetOne(Integer id){
        Dept dept = deptService.selectOne(id);
        if(Objects.isNull(dept)){
            return   JSON.toJSONString(
                    new  Dept().setDeptNo(0)
                            .setDeptName("用户不存在  @hystrix 熔断服务")
                            .setDbSource("no this DB")
            );
        }
        return JSON.toJSONString(dept);
    }
}
