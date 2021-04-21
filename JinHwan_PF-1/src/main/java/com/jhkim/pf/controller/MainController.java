package com.jhkim.pf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 컨트롤러라고 선언
@Controller
public class MainController {

	
	// home으로 오면 여기로
	@RequestMapping(value = "/home")
	public String main() {
		return "JinHwan_PF";	
	}
	
	
	
}
