package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.javaclass.model.MemberVO;

@Controller
public class AutoScanController {
	
	@Autowired
	private MemberVO vo;  
	//MemberVO 데이터 타입 객체를 vo란 이름의 변수로 지정 vo는 beans의 id 
	//MemberVO란 객체를 생성할껀데 servlet-context.xml의 beans id와 변수명을 통일해야 값을 가져올수있다.
	  	
	/*
	 * 멤버변수 객체지정
	 * 	(1) 생성자
	 * 	(2) setter
	 * 	(3) annotation
	 */
	
	@RequestMapping("/autoScan.do")  //01_autoScan.jsp에서 
	public ModelAndView test() {
		System.out.println("autoScan.do 요청 확인");
		ModelAndView mv = new ModelAndView(); //객체 생성
		mv.setViewName("01_autoScan");  //views의 01_autoScan.jsp파일으로
		mv.addObject("vo",vo); //servlet-context.xml파일에 있는 id = vo
		return mv;
	}
}
