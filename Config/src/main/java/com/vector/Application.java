package com.vector;

/**
 * Created by DCITS-cs on 2018/6/30.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
