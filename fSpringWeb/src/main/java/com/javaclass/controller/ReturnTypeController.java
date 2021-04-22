package com.javaclass.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**********************
 *		뷰페이지로 데이타 전달하는 방식
 *		1. ModelAndView
 *		2. Map(HashMap)  -잘 사용 안함
 *		3. Model
 */
@Controller
public class ReturnTypeController {
	@RequestMapping("modelandview.do")
	public ModelAndView a() {
		ModelAndView mv = new ModelAndView();
		//Model과 View 두개를 받을거니까 데이터를 두개 받아야함
		//1.mv.addObject("message","오늘 점심은 버킹!!")
		//2.mv.setViewName("test");
		mv.addObject("message","오늘 점심은 버킹!!");
		mv.addObject("addr","버거킹");
		mv.addObject("menu","콰트로인더버걸~");
		mv.setViewName("test");   //test.jsp라는View로 이동
		return mv;
	}
	
	@RequestMapping("map.do")
	public Map b() {
		Map m = new HashMap();
		m.put("message", "오늘 점심은 버킹!!");
		m.put("addr", "버거킹");
		m.put("menu", "콰트로인더버걸~!");
		return m;
	}	
	/* 
	 * 문제점은 뷰페이지 지정을 못함
	 * 리턴값이 Map 정해져서 뷰페이지 지정할 방법은
	 * 자동으로 map.do => map.jsp
	 */
	
	@RequestMapping("model.do")
	public String c(Model m) {
		m.addAttribute("message", "오늘 점심은 버킹!!");
		m.addAttribute("addr", "버거킹");
		m.addAttribute("menu", "콰트로인더버걸~!");
		return "test";
		//return이 test.jsp
	}
	
	/*******************
	 *  Model 객체를 이용해서 뷰페이지로 지정할 때(*****)
	 *  리턴이 아니라 인자에 지정하기
	 */
}
