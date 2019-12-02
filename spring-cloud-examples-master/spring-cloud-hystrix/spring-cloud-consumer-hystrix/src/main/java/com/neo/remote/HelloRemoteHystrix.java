package com.neo.remote;

import com.neo.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 创建回调类
 * 创建HelloRemoteHystrix类继承与HelloRemote实现回调的方法
 *
 * 返回值为服务熔断(服务调用失败)的时候返回的内容
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
