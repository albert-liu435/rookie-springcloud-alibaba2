package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * nacos执行 startup.cmd -m standalone
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosOpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosOpenFeignApplication.class, args);

//        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosOpenFeignApplication.class, args);
//        String userName = applicationContext.getEnvironment().getProperty("user.names");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.err.println("user name :"+userName+"; age: "+userAge);
    }
}
