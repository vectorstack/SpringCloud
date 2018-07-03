package com.vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 12345 on 2018-6-29.
 */
@RestController
public class HelloController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return "Hello World!,端口："+port;
    }
}
