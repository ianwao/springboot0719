package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("return")
public class HelloWorldController {
	private final static Logger LOGGER=(Logger) LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	@ResponseBody
	public String HelloWorld() {
		LOGGER.info("接口：helloworld，入");
		String name="zhangsan";
		LOGGER.debug("接口，helloworld，调试");
		List<String> list=new ArrayList<>();
		
		try {
			String myName=list.get(3);
		}catch(Exception e) {
			String xiaoming="xiaoming";
			LOGGER.error("接口，helloworld，错误信息:{},执行者:{}", e, xiaoming);
		}
		
		LOGGER.info("接口：helloworld，出");
		return "hello world";
	}
	
	@RequestMapping("/hi")
	public String Hi() {
		LOGGER.info("网页：hi.html，入");
		LOGGER.debug("网页：hi.html调试");
		List<String> list=new ArrayList<>();
		
		try {
			String myName=list.get(2);
		}catch(Exception e) {
			LOGGER.error("网页：hi.html错误信息:{},执行者:{}", e);
		}
		
		LOGGER.info("网页：hi.html，出");
		
		return "hi";
	}
}
