//package com.rookie.bigdata.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Classname GatewayConfig
// * @Description
// * @Author rookie
// * @Date 2023/3/2 13:54
// * @Version 1.0
// */
//@Configuration
//public class GatewayConfig {
//
//    //通过Bean方式来配置路由规则
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route2", r -> r.path("/employee/*")
//                        .uri("http://localhost:8001/employee/*"))
//                .build();
//    }
//
//}
