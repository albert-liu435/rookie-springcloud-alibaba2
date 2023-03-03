package com.rookie.bigdata.domain;

import lombok.Data;

/**
 * @Classname Employee
 * @Description
 * @Author rookie
 * @Date 2023/3/1 16:46
 * @Version 1.0
 */
@Data
public class Employee {
    //CREATE TABLE `employee` (
    //                            `id` bigint(20) NOT NULL AUTO_INCREMENT,
    //                            `name` varchar(100) NOT NULL,
    //                            `age` int(11) NOT NULL,
    //                            `salary` bigint(20) NOT NULL,
    //                            PRIMARY KEY (`id`),
    //                            UNIQUE KEY `name` (`name`)
    //) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


    private int id;

    private String name;

    private int age;

    private int salary;

}
