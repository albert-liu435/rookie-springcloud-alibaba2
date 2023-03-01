package com.rookie.bigdata.controller;

import com.rookie.bigdata.common.Result;
import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname EmployeeController
 * @Description
 * @Author rookie
 * @Date 2023/3/1 15:47
 * @Version 1.0
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {



    @Autowired
    private EmployeeService employeeService;



    @GetMapping("/{id}")
    public Result getEmployee(@PathVariable int id) {
        Employee employee=employeeService.getEmployee(id);
        return  Result.succ(employee);
    }





}
