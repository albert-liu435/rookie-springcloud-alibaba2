package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Employee;

import java.util.List;

/**
 * @Classname EmployeeService
 * @Description TODO
 * @Author rookie
 * @Date 2023/3/1 15:55
 * @Version 1.0
 */
public interface EmployeeService {
    /**
     * 查询操作
     *
     * @param id
     * @return
     */
    Employee getEmployee(int id);

    /**
     * 查询操作
     *
     * @param ids
     * @return
     */
    List<Employee> getEmployeeByIds(List<Integer> ids);

    /**
     * 创建操作
     *
     * @param employee
     * @return
     */
    Integer create(Employee employee);

    /**
     * 批量插入
     *
     * @param employees
     * @return
     */
    Integer createList(List<Employee> employees);
}
