package com.datamine.repojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.datamine.repository.UserRepository;



@ComponentScan(basePackages = { "com.datamine.*" })
@EntityScan("com.datamine.*")   
@SpringBootApplication
@ComponentScan("com.datamine.model")
@EnableJpaRepositories(basePackageClasses=UserRepository.class)
public class RepojpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepojpaApplication.class, args);
	}

}
