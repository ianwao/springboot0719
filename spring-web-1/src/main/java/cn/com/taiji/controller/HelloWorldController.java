package cn.com.taiji.controller;

import java.awt.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloWorldController {
	private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("/helloword")  
	@ResponseBody
	public String HelloWorld() {
		LOGGER.info("接口：hello,入");
		String sm ="Helloworld";
		LOGGER.debug("接口：hello.调试");
		ArrayList list =new ArrayList();
		try {
			String myname = (String) list.get(3);
		}catch(Exception x) {
			String xiaoming = "xiaoming";
			LOGGER.error("接口：hello,错误信息：{},执行者:{}", x, xiaoming);
		}
		
		LOGGER.info("接口：hello,出");
		return sm;
		
	}
	
	@RequestMapping("/hello")
	public String HelloWorld1() {
		LOGGER.info("接口：hello,入");
		String sm ="hi";
		LOGGER.info("接口：hello,出");
		return sm;
	}
	

}
