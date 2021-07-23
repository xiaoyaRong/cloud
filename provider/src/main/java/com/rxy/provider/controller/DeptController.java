package com.rxy.provider.controller;

import com.alibaba.fastjson.JSON;
import com.rxy.provider.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("one/{id}")
    public String getList(@PathVariable("id") Integer id){

        return JSON.toJSONString(deptService.selectOne(id));
    }
    @RequestMapping("who")
    public String who(){
        return "provider1";
    }
}
