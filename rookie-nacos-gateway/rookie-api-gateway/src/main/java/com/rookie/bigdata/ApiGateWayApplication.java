package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * nacos执行 startup.cmd -m standalone
 */
@SpringBootApplication
public class ApiGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayApplication.class, args);

//        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosLoadbalancerApplication.class, args);
//        String userName = applicationContext.getEnvironment().getProperty("user.names");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.err.println("user name :"+userName+"; age: "+userAge);
    }
}
