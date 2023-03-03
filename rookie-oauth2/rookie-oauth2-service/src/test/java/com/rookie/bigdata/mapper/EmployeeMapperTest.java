package com.rookie.bigdata.mapper;


import com.rookie.bigdata.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname EmployeeMapperTest
 * @Description
 * @Author rookie
 * @Date 2023/3/1 16:52
 * @Version 1.0
 */
@SpringBootTest
@ActiveProfiles("dev")
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void getEmployee() {
        Employee employee = employeeMapper.getEmployee(1);
        System.out.println(employee);
    }

    @Test
    void getEmployeeByIds() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Employee> employeeByIds = employeeMapper.getEmployeeByIds(list);
        for (Employee employeeById : employeeByIds) {
            System.out.println(employeeById);
        }

    }

    @Test
    void create() {
        Employee employee = new Employee();
        employee.setAge(10);
        employee.setName("abc");
        employee.setSalary(100);


        Integer integer = employeeMapper.create(employee);
        System.out.println(integer);

    }

    @Test
    void createList() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setAge(10);
        employee.setName("abc2");
        employee.setSalary(100);

        Employee employee1 = new Employee();
        employee1.setAge(10);
        employee1.setName("abc1");
        employee1.setSalary(1000);

        employeeList.add(employee);
        employeeList.add(employee1);


        Integer integer = employeeMapper.createList(employeeList);
        System.out.println(integer);

    }

}