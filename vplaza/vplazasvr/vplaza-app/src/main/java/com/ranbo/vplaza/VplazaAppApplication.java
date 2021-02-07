package com.ranbo.vplaza;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.ranbo.vplaza.db.mapper")
public class VplazaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VplazaAppApplication.class, args);
	}

}
