package com.neo.task;

import java.time.LocalDateTime;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {

    private static Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

    @Autowired
    private ThreadPoolTaskScheduler taskScheduler;

    @Scheduled(cron = "*/1 * * * * ?") public void process1() throws InterruptedException {
        logger.info(
            "AAAAAA-------》Date [{}], corePoolSize [{}], maxPoolSize [{}], largestPoolSize [{}], activeCount [{}], queueSize [{}]",
            LocalDateTime.now(), taskScheduler.getScheduledThreadPoolExecutor().getPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getMaximumPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getLargestPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getActiveCount(),
            taskScheduler.getScheduledThreadPoolExecutor().getQueue().size());
    }

    @Scheduled(cron = "*/1 * * * * ?") public void process2() {
        logger.info(
            "BBBBBB-------》Date [{}], corePoolSize [{}], maxPoolSize [{}], largestPoolSize [{}], activeCount [{}], queueSize [{}]",
            LocalDateTime.now(), taskScheduler.getScheduledThreadPoolExecutor().getPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getMaximumPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getLargestPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getActiveCount(),
            taskScheduler.getScheduledThreadPoolExecutor().getQueue().size());
    }

    @Scheduled(cron = "*/1 * * * * ?") public void process3() {
        logger.info(
            "CCCCCC-------》Date [{}], corePoolSize [{}], maxPoolSize [{}], largestPoolSize [{}], activeCount [{}], queueSize [{}]",
            LocalDateTime.now(), taskScheduler.getScheduledThreadPoolExecutor().getPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getMaximumPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getLargestPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getActiveCount(),
            taskScheduler.getScheduledThreadPoolExecutor().getQueue().size());
    }

    @Scheduled(cron = "*/1 * * * * ?") public void process4() throws InterruptedException {
        logger.info(
            "DDDDDD-------》Date [{}], corePoolSize [{}], maxPoolSize [{}], largestPoolSize [{}], activeCount [{}], queueSize [{}]",
            LocalDateTime.now(), taskScheduler.getScheduledThreadPoolExecutor().getPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getMaximumPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getLargestPoolSize(),
            taskScheduler.getScheduledThreadPoolExecutor().getActiveCount(),
            taskScheduler.getScheduledThreadPoolExecutor().getQueue().size());
    }

}
