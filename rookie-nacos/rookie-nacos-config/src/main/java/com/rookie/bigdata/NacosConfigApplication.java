package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * nacos执行 startup.cmd -m standalone
 */
@SpringBootApplication
public class NacosConfigApplication {
    public static void main(String[] args) {
//        SpringApplication.run(NacosConfigApplication.class, args);

        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.names");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        System.err.println("user name :"+userName+"; age: "+userAge);
    }
}
