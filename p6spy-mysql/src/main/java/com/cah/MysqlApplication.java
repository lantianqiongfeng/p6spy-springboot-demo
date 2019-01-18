package com.cah;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;

@SpringBootApplication
@Slf4j
public class MysqlApplication {

    public static void main(String[] args) {
        log.info("====启动开始====");
        SpringApplication springApplication = new SpringApplication(MysqlApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
        log.info("====启动结束====");
    }
}
