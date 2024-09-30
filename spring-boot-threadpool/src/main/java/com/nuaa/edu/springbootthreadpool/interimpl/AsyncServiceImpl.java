package com.nuaa.edu.springbootthreadpool.interimpl;

import com.nuaa.edu.springbootthreadpool.inter.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 类
 * 定义spring-boot-examples中的AsyncServiceImpl
 *
 * @author : zhou.ww
 * @version 1.0
 * @Project: spring-boot-examples
 * @Package com.nuaa.edu.springbootthreadpool.interimpl
 * @date Date : 2024/9/29 09:27
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Override @Async("asyncServiceExecutor") public void executeAsync() {
        logger.info("start executeAsync");

        System.out.println("异步线程要做的事情");
        System.out.println("可以在这里执行批量插入等耗时的事情");
        try {
            Thread.sleep(50000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        logger.info("end executeAsync");
    }
}

