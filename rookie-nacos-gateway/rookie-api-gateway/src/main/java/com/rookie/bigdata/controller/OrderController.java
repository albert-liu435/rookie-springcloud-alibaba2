//package com.rookie.bigdata.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import javax.annotation.Resource;
//
///**
// * @Classname OrderController
// * @Description
// * @Author rookie
// * @Date 2023/2/28 17:14
// * @Version 1.0
// */
//@RestController
//public class OrderController {
//
//    protected final Logger log = LoggerFactory.getLogger(OrderController.class);
//    @Resource
//    private RestTemplate restTemplate;
//
//    @Value("${service-url.nacos-user-service}")
//    private String serverURL;
//
//    @GetMapping(value = "/consumer/payment/nacos/{id}")
//    public String paymentInfo(@PathVariable("id") Long id) {
//        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
//    }
//
//}