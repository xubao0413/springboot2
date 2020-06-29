package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringBoot----SpringLoader
 * 
 * Run As -> Run Configurations -> Arguments -> VM arguments
 * 启动命令： -javaagent:.\lib\springloaded-1.2.5.RELEASE.jar-noverify
 *
 */
@Controller
public class UsersController {

	@RequestMapping("/show")
	public String showPage(){
		System.out.println("ShowPage......init。。。");
		return "index";
	}
}
