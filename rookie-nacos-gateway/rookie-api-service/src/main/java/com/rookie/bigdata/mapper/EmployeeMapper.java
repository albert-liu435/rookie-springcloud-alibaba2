package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname EmployeeMapper
 * @Description
 * @Author rookie
 * @Date 2023/3/1 16:00
 * @Version 1.0
 */
public interface EmployeeMapper {

    //增删改查

    Employee getEmployee(@Param("id") int id);

//    int createEmployee(Employee employee);
//
//    int updateEmployee(Employee employee);
//
//    int deleteEmployee(Employee employee);

}
