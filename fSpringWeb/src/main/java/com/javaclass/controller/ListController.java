package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;
import com.javaclass.model.MemberVOList;

@Controller
public class ListController {
		
	@RequestMapping("/multiInsert.do")
	public void list(MemberVOList memberVOList) {
		// 추후에 모델단을 호출 (DB 연동 insert)
		for(MemberVO m : memberVOList.getList()) {
			System.out.println(m.isState() +"/"+
							   m.getId()+"/"+m.getName()+"/"+m.getAge());
		}
	}
	//************** 함수의 리턴형이 void 인 경우
	// 요청 : multiInsert.do
	// 뷰페이지 : multiInsert.jsp
}
