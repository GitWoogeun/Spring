package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //Controller 역활하는 애야 스티커 부착
public class StartController {

	@RequestMapping("/start.do")
	public ModelAndView start() {
		System.out.println("start.do 요청 확인");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","오늘 점심 반찬은 무엇일까??");
		mv.setViewName("hello"); // "/WEB-INF/views/" + hello +".jsp"
		return mv; //객체 이름이 hello
	}
}
