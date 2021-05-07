package com.mox.controller;

import com.mox.entity.UsUser;
import com.mox.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
@RefreshScope
public class TestController {

    @Resource
    private UserService userService;

    @Value("${spring.datasource.password}")
    public String name;

    @GetMapping("/user/{id}")
    public UsUser getUserById(@PathVariable("id") Integer id){
        UsUser usUser = userService.selectByPrimaryKey(id);
        return usUser;
    }
    @GetMapping("/ll")
    public String getName(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }

    @GetMapping("/user")
    public String test(){
        return "123";
    }
}
