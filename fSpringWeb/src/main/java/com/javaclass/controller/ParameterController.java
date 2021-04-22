package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

//Controller ��Ȱ �Ѵٴ� ��ƼĿ ����
@Controller
public class ParameterController {
	
	/*@RequestMapping("param.do")
	public void param() {
		System.out.println("param.do Ȯ��");
	}*/
	
	@RequestMapping("param.do")
	public void param(String id,@RequestParam(defaultValue = "0") int age) {
		System.out.println("param.do 요청 확인: "+id+"/"+age);
	}
	
	@RequestMapping(value="paramForm.do",method=RequestMethod.POST)
	//********************************
	//세션처리
	public ModelAndView paramForm(MemberVO vo, HttpSession session) {
		//추후에 DB에서 검색해 올 아이디와 패스워드
		String name = "이민기";
		String id = "Leemingi";
		//로그인 확인
		if(vo.getId().equals(id) && vo.getName().equals(name)) {
			System.out.println(id+"님로그인 성공!");
			session.setAttribute("login",id+"님 로그인중");
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo",vo);
		mv.setViewName("param2");
		return mv;
	}
	
	/*
	 *  뷰페이지를 지정 방식
	 *  1.ModelAndView 에 setViewName()로 지정하고
	 *  	ModelAndView 객체를 리턴
	 *  2. String을 리턴하면 그 리턴값이 뷰 페이지명
	 *  3. void로 리턴하면 요청명과 동일한 뷰페이지 자동 지정됨
	 * 
	 */
}
