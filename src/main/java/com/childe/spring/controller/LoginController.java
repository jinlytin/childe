package com.childe.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by user on 2017/3/28.
 */
@RestController
public class LoginController
{
    @RequestMapping("/")
    public String index(){

        System.out.print("hello");
        return "hello word";
    }
}
