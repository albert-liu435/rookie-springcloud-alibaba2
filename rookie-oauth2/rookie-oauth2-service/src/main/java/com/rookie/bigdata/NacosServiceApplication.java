package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * nacos执行 startup.cmd -m standalone
 * java -jar rookie-nacos-service.jar --spring.profiles.active=8002
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosServiceApplication.class, args);

//        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosServiceApplication.class, args);
//        String userName = applicationContext.getEnvironment().getProperty("user.names");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.err.println("user name :"+userName+"; age: "+userAge);
    }
}
