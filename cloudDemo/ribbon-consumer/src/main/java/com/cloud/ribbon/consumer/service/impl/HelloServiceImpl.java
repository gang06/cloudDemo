package com.cloud.ribbon.consumer.service.impl;

import com.cloud.ribbon.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ligegang
 * @title: HelloServiceImpl
 * @projectName ribbon
 * @description: TODO
 * @date 2019/10/23 16:43
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello() {
        return restTemplate.getForObject("http://RIBBON-PROVIDER/hello?name=zhangtaifeng",String.class);
    }
}
