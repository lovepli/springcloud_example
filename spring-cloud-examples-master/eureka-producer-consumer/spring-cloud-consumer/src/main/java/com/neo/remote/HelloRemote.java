package com.neo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign是一个声明式Web Service客户端。使用Feign能让编写Web Service客户端更加简单,
 * 它的使用方法是定义一个接口，然后在上面添加注解，同时也支持JAX-RS标准的注解。
 * Feign也支持可拔插式的编码器和解码器。Spring Cloud对Feign进行了封装，使其支持了Spring MVC标准注解和HttpMessageConverters。
 * Feign可以与Eureka和Ribbon组合使用以支持负载均衡。
 *
 * 下面是feignClient调用实现：
 * name:远程服务名，及spring.application.name配置的名称
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {  //feign定义的接口

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


}
