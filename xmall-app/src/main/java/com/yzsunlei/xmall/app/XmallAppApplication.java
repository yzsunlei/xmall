package com.yzsunlei.xmall.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan({"com.yzsunlei.xmall.db.mapper","com.yzsunlei.xmall.app.dao"})
@EnableScheduling
public class XmallAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallAppApplication.class, args);
    }

}
