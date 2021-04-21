package com.jhkim.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 처음 시작시 컨트롤러 찾아가게끔 해줌
@ComponentScan(basePackages = {"com.jhkim.pf.controller"})
// 스프링 서버를 돌리기 위해서 필요
@SpringBootApplication
public class JinHwanPf1Application {

	public static void main(String[] args) {
		SpringApplication.run(JinHwanPf1Application.class, args);
	}

}
