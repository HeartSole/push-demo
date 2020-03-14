package com.example.gitdemo.controller;

import com.example.gitdemo.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiaoXin
 * @date 2020/3/14 下午7:58
 */
@RestController
public class UserController {
    @GetMapping("/user/{name}")
    private String getUser(@PathVariable("name")String name){
        User user = new User(name);
        return "欢迎你使用git\n"+user;
    }
}
