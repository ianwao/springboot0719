package cn.com.taiji.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	 @RequestMapping("/Hello")
	 @ResponseBody
     public String Helloworld() {
		return "Hello World|";
		
    	 
     }
}
