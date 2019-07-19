package com.ianw.springbootseconddemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        String name = "Hello";
        return name;
    }

    @RequestMapping("/worldhaha")
    public String wrold(){
        String name = "world";
        return name;
    }

}
