package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringBoot处理异常方式一：自定义错误页面
 * SpringBoot默认出现异常会请求/error页面，所以需要在src/main/resources/templates目录下自定义error.html页面
 * 
 */
@Controller
@RequestMapping("exception1")
public class Exception1Controller {
	
	@RequestMapping("/show")
	public String showInfo(){
		String str = null;
		str.length();
		return "index";
	}
	
	@RequestMapping("/show2")
	public String showInfo2(){
		int a = 10/0;
		return "index";
	}
	
}