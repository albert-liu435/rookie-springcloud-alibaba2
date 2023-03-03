package com.rookie.bigdata.controller;

import com.rookie.bigdata.common.Result;
import com.rookie.bigdata.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname EmployeeController
 * @Description
 * @Author rookie
 * @Date 2023/3/1 17:09
 * @Version 1.0
 */
@RestController
public class EmployeeController {

    protected final Logger log = LoggerFactory.getLogger(OrderController.class);
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    /**
     * 访问方式 http://localhost:8081/employee/nacos/1
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/employee/nacos/{id}")
    public Result getEmployee(@PathVariable("id") int id) {
//        return restTemplate.getForObject(serverURL + "/employee/" + id, Result.class);
        return restTemplate.getForObject(serverURL + "/employee/{1}", Result.class, id);
    }




    @RequestMapping("/employee/nacos/create")
    public Result create(@RequestBody Employee employee) {
        return restTemplate.postForObject(serverURL + "/employee/create", employee,Result.class);
    }



}
