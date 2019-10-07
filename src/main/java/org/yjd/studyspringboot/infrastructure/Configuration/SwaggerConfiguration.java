package org.yjd.studyspringboot.infrastructure.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// 引入swagger
// 通过@Configuration注解，让Spring来加载该类配置。再通过@EnableSwagger2注解来启用Swagger2。
/*@Configuration  // //让Spring来加载该类配置
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public class createRestApi() {
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.yss.ms.admin"))
                    .paths(PathSelectors.any())
                    .build();
        }
    }
}*/
