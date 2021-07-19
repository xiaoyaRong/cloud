package com.rxy.provider.controller;

import com.alibaba.fastjson.JSON;
import com.rxy.provider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rongxiaoya
 */
@RestController
@RequestMapping("dept/")
public class DeptController {
    @Autowired
    private IDeptService deptService;

    @RequestMapping("list")
    public String getList(){
        return JSON.toJSONString(deptService.selectList());
    }
    @RequestMapping("one")
    public String getList(Integer id){
        return JSON.toJSONString(deptService.selectOne(id));
    }
}
