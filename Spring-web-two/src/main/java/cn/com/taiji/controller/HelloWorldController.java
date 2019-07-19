package cn.com.taiji.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloWorldController {
	private final static Logger LOGGER=LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld1() {
		return "helloworld";
	}
	
	@RequestMapping("/hi")
	
	public String heloWorld2() {
		
		LOGGER.info("接口；helloworld，入");
	
		LOGGER.debug("接口：helloworld,调试");
		List<String> list=new ArrayList<>();
		try {
			String myName=list.get(3);
			
		}catch(Exception x){
			String xiaoming="xiaoMing";
			
			LOGGER.error("接口：helloworld,错误信息:{},执行者:{}",x,xiaoming);
		}
		LOGGER.info("接口；helloworld，出");
		return "hi";
	}

}
