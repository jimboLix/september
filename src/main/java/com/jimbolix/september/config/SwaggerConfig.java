package com.jimbolix.september.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnExpression("${swagger.enable:true}")
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)//
                        .apiInfo(new ApiInfoBuilder().title("September api")//
                                .description("September api 文档").version("v1.0.1").build())//
                .select().apis(RequestHandlerSelectors.basePackage("com.jimbolix.september"))
                .paths(PathSelectors.any()).build();
        return docket;
    }
}