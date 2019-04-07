package com.yzsunlei.xmall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@SpringBootApplication
@MapperScan({"com.yzsunlei.xmall.db.mapper","com.yzsunlei.xmall.admin.dao"})
@EnableTransactionManagement
public class XmallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(XmallAdminApplication.class, args);
    }
}
