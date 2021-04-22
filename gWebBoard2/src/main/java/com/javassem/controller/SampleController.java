package com.javassem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.service.SampleService;

@Controller
public class SampleController {

	//Service 생성
	@Autowired
	SampleService sampleService; 
	
	//요청 받기 .do라서 Controller에서 받을수있음
	//void타입이면 View클래스와 RequestMapping 요청 받은 href랑 이름이 같아야 찾아갈수있다.
	@RequestMapping("sample.do")
	public void sample(Model m) {
		String result = sampleService.sample();
				/* 뷰단으로 데이타 넘기기
				 * 1.ModelAndView
				 * 2.Model
				 * 3.Map
				 */
		m.addAttribute("result", result);
	}
}
