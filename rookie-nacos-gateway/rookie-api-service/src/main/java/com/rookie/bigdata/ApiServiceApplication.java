package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * nacos执行 startup.cmd -m standalone
 * java -jar rookie-nacos-service.jar --spring.profiles.active=8002
 */
//不需要nacos的时候注释掉
//@EnableDiscoveryClient
@SpringBootApplication
public class ApiServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiServiceApplication.class, args);


    }
}
