package provider.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.service.IDeptService;

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
        log.info("provider3");
        return JSON.toJSONString(deptService.selectList());
    }
    @RequestMapping("one")
    public String getList(Integer id){
        return JSON.toJSONString(deptService.selectOne(id));
    }
    @RequestMapping("who")
    public String who(){
        return "provider3";
    }
}
