package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述 TODO
 *
 * @Auther: jun.shen
 * @Date: 2019/10/11 10:05
 */

@RestController
//@RefreshScope
public class HelloController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${version}")
    private String version = "开发环境";

    @RequestMapping("/hello/test")
    public void test() {
        System.out.println("你好，我是" + name + ",年龄：" + age + "岁。当前环境：" + version);
    }
}
