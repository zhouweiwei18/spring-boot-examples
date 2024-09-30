package com.neo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * 类
 * 定义spring-boot-examples中的ScheduleConfig
 *
 * @author : zhou.ww
 * @version 1.0
 * @Project: spring-boot-examples
 * @Package com.neo.config
 * @date Date : 2024/9/29 15:49
 */
@Configuration
public class ScheduleConfig {

    @Bean public ThreadPoolTaskScheduler taskScheduler() {
        // 创建一个自定义的阻塞队列
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(1);
        scheduler.setThreadNamePrefix("dial-task-");
        scheduler.initialize();
        return scheduler;
    }

}
