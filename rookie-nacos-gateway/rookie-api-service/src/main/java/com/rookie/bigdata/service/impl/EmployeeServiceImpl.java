package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.mapper.EmployeeMapper;
import com.rookie.bigdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname EmployeeService
 * @Description
 * @Author rookie
 * @Date 2023/3/1 15:55
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmployee(int id) {
        return employeeMapper.getEmployee(id);
    }

    //查询数据库
}
