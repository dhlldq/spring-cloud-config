package com.ldq.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:ldq
 * Date:2019/3/12
 * Time:14:17
 * Desc:
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @RequestMapping("/test")
    public String test(){
        return this.name+this.age;
    }
}
