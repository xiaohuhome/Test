package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/hello/{username}")
	public void hello(@PathVariable("username") String username) {
		System.out.println(username);
	}
	
	@RequestMapping("/hello1/{username}")
	public void hello1(@PathVariable("username") String username) {
		System.out.println(username+"1");
	}
	
	@RequestMapping("/hello2/{username}")
	public void hello2(@PathVariable("username") String username) {
		System.out.println(username+"2");
	}
	
	@RequestMapping("/hello3/{username}")
	public void hello3(@PathVariable("username") String username) {
		System.out.println(username+"3");
	}
	
	@RequestMapping("/hello4/{username}/{password}")
	public String hello4(@PathVariable("username") String username,@PathVariable("password") String password,Model model) {
		String msg="";
		if("zhangsan".equals(username) && "123456".equals(password)) {
			msg = "登录成功";
		}else {
			msg = "登录失败";
		}
		model.addAttribute("msg", msg);
		return "hello";
	}
}
