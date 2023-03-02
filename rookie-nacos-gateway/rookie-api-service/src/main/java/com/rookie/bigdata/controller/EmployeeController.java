package com.rookie.bigdata.controller;

import com.rookie.bigdata.common.Result;
import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    public static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/{id}")
    public Result getEmployee(@PathVariable int id, @RequestParam String name) {
        logger.info("id={} & name={}", id, name);
        Employee employee = employeeService.getEmployee(id);
        return Result.succ(employee);
    }


}
