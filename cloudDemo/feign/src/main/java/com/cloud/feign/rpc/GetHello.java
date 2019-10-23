package com.cloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ligegang
 * @title: GetHello
 * @projectName feign
 * @description: TODO
 * @date 2019/10/23 17:23
 */
@FeignClient(value = "ribbon-consumer")
public interface GetHello {
    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();
}
