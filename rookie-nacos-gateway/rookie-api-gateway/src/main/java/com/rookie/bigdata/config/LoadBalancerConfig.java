//package com.rookie.bigdata.config;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
///**
// * @Classname LoadBalancerConfig
// * @Description TODO
// * @Author rookie
// * @Date 2023/2/28 17:10
// * @Version 1.0
// */
//@Configuration
//@LoadBalancerClients(defaultConfiguration = {CustomLoadBalancerConfiguration.class})
//public class LoadBalancerConfig {
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }
//}
