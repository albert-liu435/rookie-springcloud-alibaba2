package com.rookie.bigdata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Classname MybatisConfig
 * @Description
 * @Author rookie
 * @Date 2023/3/1 16:57
 * @Version 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.rookie.bigdata.mapper")
public class MybatisConfig {

//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//
//
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        return paginationInterceptor;
//    }

//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor  (){
//        MybatisPlusInterceptor mybatisPlusInterceptor=new MybatisPlusInterceptor();
//        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//        return mybatisPlusInterceptor;
//    }
}
