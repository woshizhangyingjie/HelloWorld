package org.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhang
 * @Date 2022/9/8 - 20:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("")
    public String hello(){
        System.out.println("Hello World");
        return "OK";
    }

}
