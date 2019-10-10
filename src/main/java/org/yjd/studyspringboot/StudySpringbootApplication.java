package org.yjd.studyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 包含了@ComponentScan({"org.yjd.studyspringboot"})
@SpringBootApplication

//  扫描@Repository, 这个加不加都可以
// @EnableJpaRepositories()

//启用Mvc，非springboot框架需要引入注解@EnableWebMvc
// @EnableWebMvc
// @ComponentScan({"org.yjd.studyspringboot"})

public class StudySpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudySpringbootApplication.class, args);
	}

}
