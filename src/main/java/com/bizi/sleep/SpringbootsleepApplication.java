package com.bizi.sleep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tengyue
 */
@SpringBootApplication
@MapperScan("com.bizi.sleep.mapper")
public class SpringbootsleepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsleepApplication.class, args);
	}

}
