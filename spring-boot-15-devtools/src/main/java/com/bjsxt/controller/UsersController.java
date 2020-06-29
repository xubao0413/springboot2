package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringBoot----devtools
 *
 *
 */
@Controller
public class UsersController {

	@RequestMapping("/show")
	public String showPage(){
		System.out.println("ShowPage......init....bbb");
		return "index";
	}
}
