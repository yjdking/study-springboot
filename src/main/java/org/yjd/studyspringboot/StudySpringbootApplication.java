package org.yjd.studyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// 包含了@ComponentScan({"org.yjd.studyspringboot"})
@SpringBootApplication
// @EnableJpaRepositories("org.yjd.studyspringboot.infrastructure.persistence.hibernate")
//  扫描@Repository
@EnableJpaRepositories(basePackages = "org.yjd.studyspringboot.infrastructure.persistence.hibernate")

//启用Mvc，非springboot框架需要引入注解@EnableWebMvc
// @EnableWebMvc
// @ComponentScan({"org.yjd.studyspringboot"})

public class StudySpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudySpringbootApplication.class, args);
	}

}
