package com.cloud.feign.rpc;

import org.springframework.stereotype.Service;

/**
 * @author ligegang
 * @title: GetHelloHystrix
 * @projectName cloudDemo
 * @description: TODO
 * @date 2019/12/12 15:19
 */
@Service
public class GetHelloHystrix implements GetHello{
    @Override
    public String sayHello() {
        return "进入到熔断模式";
    }
}
