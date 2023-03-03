package com.rookie.bigdata.controller;

import com.rookie.bigdata.common.Result;
import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Classname EmployeeFeignController
 * @Description
 * @Author rookie
 * @Date 2023/3/1 17:32
 * @Version 1.0
 */
@RestController
public class EmployeeFeignController {
    protected final Logger log = LoggerFactory.getLogger(OrderController.class);

//    @Resource
//    private RestTemplate restTemplate;
//
//    @Value("${service-url.nacos-user-service}")
//    private String serverURL;

    @Autowired
    private EmployeeService employeeService;

    /**
     * 访问方式 http://localhost:8081/employee/nacos/1
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/employee/nacos/{id}")
    public Result getEmployee(@PathVariable("id") int id) {
//        return restTemplate.getForObject(serverURL + "/employee/" + id, Result.class);

        return employeeService.getEmployee(id);
    }


    @RequestMapping("/employee/nacos/create")
    public Result create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }


}
