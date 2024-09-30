package com.nuaa.edu.springbootthreadpool.controller;

import com.nuaa.edu.springbootthreadpool.inter.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类
 * 定义spring-boot-examples中的ThreadDemo
 *
 * @author : zhou.ww
 * @version 1.0
 * @Project: spring-boot-examples
 * @Package com.nuaa.edu.springbootthreadpool.controller
 * @date Date : 2024/9/29 09:28
 */
@RestController
public class ThreadDemo {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async") public String async() {
        asyncService.executeAsync();
        return "hello world";
    }
}
