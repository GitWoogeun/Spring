package com.javassem.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.dao.MemberDAO;
import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//회원가입화면 출력
	//@RequestMapping 내가 지은 이름
	@RequestMapping(value="user/userJoin.do") //회원가입 View(화면)
	public void userInsert(MemberVO vo)throws IOException{
		System.out.println("회원가입 화면 출력");
	}
	
	@RequestMapping(value="user/userInsert.do")
	public String userJoinok(MemberVO vo) {
		System.out.println("회원가입버튼 눌렀따.");
		memberService.userInsert(vo);
		return "user/userJoin_ok"; 
		//회원가입이 되었을때 나오는 jsp(view)
	}
	
	@RequestMapping(value="user/userLogin.do")
	public void userLogin(MemberVO vo)throws IOException{
		System.out.println("로그인버튼 눌렀다.");
	}
}
