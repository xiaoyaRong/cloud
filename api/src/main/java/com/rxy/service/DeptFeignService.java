package com.rxy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "PROVIDER")
public interface DeptFeignService {

    @RequestMapping("dept/list")
    String list();

    @RequestMapping("dept/one")
    String getList(Integer id);

    @RequestMapping("dept/who")
    String who();


}
