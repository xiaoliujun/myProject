package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	@MapperScan("com.mapper")  //扫描Mybatis接口文件
	public class RunApplication {
	 public static void main(String[] args) {
	  SpringApplication.run(RunApplication.class, args);
	 }
	}

