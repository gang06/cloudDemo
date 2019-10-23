package com.cloud.feign.service.impl;

import com.cloud.feign.rpc.GetHello;
import com.cloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /*@Autowired
    private RestTemplate restTemplate;*/
    @Autowired
    private GetHello getHello;

    @Override
    public String sayHello() {
        return getHello.sayHello();
    }
}
