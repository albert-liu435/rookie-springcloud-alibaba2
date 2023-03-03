package com.rookie.bigdata.controller;

import com.rookie.bigdata.common.Result;
import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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



    @RequestMapping("/{id}")
    public Result getEmployee(@PathVariable int id) {
        Employee employee=employeeService.getEmployee(id);
        return  Result.succ(employee);
    }

    @RequestMapping("/getUserByIds")
    public Result getEmployeeByIds(@RequestParam List<Integer> ids) {


//        System.out.println(ids);
//        return Result.succ();
        List<Employee> employees=employeeService.getEmployeeByIds(ids);
        return  Result.succ(employees);
    }


    @RequestMapping("/create")
    public Result create(@RequestBody Employee employee) {
        Integer integer=employeeService.create(employee);
        return  Result.succ();
    }

    @RequestMapping("/createList")
    public Result createList(@RequestBody List<Employee> employees) {
        Integer integer=employeeService.createList(employees);
        return  Result.succ();
    }

    //更新



}
