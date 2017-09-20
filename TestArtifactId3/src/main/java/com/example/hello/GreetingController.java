package com.example.hello;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController //A convenience annotation that is itself annotated with @Controller and @ResponseBody.
@RequestMapping("/hello/greeting")
public class GreetingController {
	
	
	
	
    //@RequestMapping("/")
	//@RequestMapping("/a") default get
	@RequestMapping(value = "/toGreet",method = RequestMethod.GET)
	public String showMyGreeting(HttpServletRequest request, HttpServletResponse response) {
        return "hello user!"+"<a href='"+request.getContextPath()+"/"+"hello/myUserHomePage/showa'>user home page</a>";
		//return "hello";
    }



}
