package com.lhy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.lhy.dao") // 扫描dao文件创建对象
public class SpringBoot  {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }

}
