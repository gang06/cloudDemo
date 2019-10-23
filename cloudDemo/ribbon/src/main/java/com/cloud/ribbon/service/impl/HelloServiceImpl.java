package com.cloud.ribbon.service.impl;

import com.cloud.ribbon.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author ligegang
 * @title: HelloServiceImpl
 * @projectName ribbon
 * @description: TODO
 * @date 2019/10/23 16:43
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "helloWorld";
    }
}
