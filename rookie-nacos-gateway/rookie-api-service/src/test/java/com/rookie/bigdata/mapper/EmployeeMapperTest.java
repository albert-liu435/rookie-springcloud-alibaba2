package com.rookie.bigdata.mapper;


import com.rookie.bigdata.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

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
}