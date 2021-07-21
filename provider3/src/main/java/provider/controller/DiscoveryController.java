package provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dis/")
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("info")
    public Object getDiscoveryInfo(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> provider01 = discoveryClient.getInstances("PROVIDER01");
        return provider01;
    }

}
