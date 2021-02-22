package com.lzxx.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 项目启动类
 * @date 2021/2/21
 */
@SpringBootApplication(scanBasePackages = {"com.lzxx.*"})
@MapperScan("com.lzxx.**.mapper")
@EnableTransactionManagement
@EnableScheduling // 开启定时任务支持
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  社区飞信 SpringBoot 后端启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
