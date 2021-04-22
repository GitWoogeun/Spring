package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller
@RequestMapping("/re")  //RequestMappingController에서 ("/re")를 잡아주고
public class RequestMappingController {
	/**************
	 * 	뷰 페이지 지정 방식
	 * 	1) ModelAndView에 setViewName() 지정
	 * 	2) 함수의 리턴형을 String 인 경우 (******************)
	 * 		그 리턴값이 뷰페이지
	 */
	
	@RequestMapping(value={"/a.do","/b.do"}) //(/a.do)를 여기서 잡는다.
	public String test() {
		System.out.println("a.do 요청 확인2");
		return "hello";
	}
	
	/**************************
	 * 함수의 리턴형이 void 인 경우
	 * 		요청명과 동일한 뷰페이지 자동으로 저장됨
	 */	
	@RequestMapping(value = "c.do")
	public void xxxx(String id) {
		System.out.println("c.do 요청확인 id>"+id);
	}
		
	//방식1
	/*@RequestMapping(value="request.do")
	public void req(@ModelAttribute("vo") MemberVO vo) {
		System.out.println("request.do 요청을 받음");
	}*/
	//방식2
	@RequestMapping(value="request.do")
	public void req(MemberVO vo) {
		System.out.println("request.do 요청을 받음");
	}
}
