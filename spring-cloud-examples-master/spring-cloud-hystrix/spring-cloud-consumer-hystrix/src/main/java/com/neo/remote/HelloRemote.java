package com.neo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 因为熔断只是作用在服务调用这一端。所以我们改动的地方不多
 *
 * 添加fallback属性
 * 在HelloRemote类添加指定fallback类，在服务熔断的时候返回fallback类中的内容
 */
@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
