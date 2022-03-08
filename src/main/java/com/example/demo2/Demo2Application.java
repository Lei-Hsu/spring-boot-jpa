package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"com.example.demo2","com.example.model", "com/example/demo2/controllers", "com/example/demo2/services", "com/example/demo2/dao", "com/example/demo2/dto"})
//@EntityScan({"com.example.demo2","com.example.model", "com/example/demo2/controllers", "com/example/demo2/services", "com/example/demo2/dao", "com/example/demo2/dto"})
//@EnableJpaAuditing
//@EnableJpaRepositories({"com.example.hello.word","com.example.dao","com.example.controller","com.example.service"})
@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
