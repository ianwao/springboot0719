package cn.com.taiji.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("/helloworldweb")
	@ResponseBody
	public String HelloWorld() {
		LOGGER.info("接口：hello, 入");
		String s = "helloworld";
		LOGGER.info("接口：hello, 出");
		
		return s;
	}
	@RequestMapping("/hello")
	public String HelloWorld1() {
		LOGGER.info("接口：hello, 入");
		String s = "hi";
		LOGGER.info("接口：hello, 出");
		
		return s;
	}
}
