package com.jimbolix.september;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jimbolix.september.mapper")
public class SeptemberApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SeptemberApplication.class);
        logger.info("启动类启动");
        SpringApplication.run(SeptemberApplication.class, args);
    }

}
