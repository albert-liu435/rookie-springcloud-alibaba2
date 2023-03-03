package com.rookie.bigdata.service;

import com.rookie.bigdata.common.Result;
import com.rookie.bigdata.domain.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @Classname EmployeeService
 * @Description
 * @Author rookie
 * @Date 2023/3/3 11:11
 * @Version 1.0
 */
@FeignClient(value = "rookie-nacos-service")
public interface EmployeeService {

    @GetMapping("/employee/{id}")
    Result getEmployee(@PathVariable int id);


    @PostMapping("/employee/create")
    Result create(@RequestBody Employee employee);


}

