package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;
import com.javassem.service.BoardServiceImpl;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	
	@RequestMapping("{step}.do")
	public String test(@PathVariable String step) {
		System.out.println(step+"요청 확인");
		
		return step;
	}
	//등록이라는 버튼 눌렀을시 데이터 저장
	@RequestMapping("saveBoard.do")
	public String saveBoard(BoardVO vo) {
		boardService.insertBoard(vo);
		//********* 리다이렉트를 지정( 다른 요청을 부를 것임)
		return "redirect:/getBoardList.do";
	}
	
	//전체의 리스트 목록 확인
	@RequestMapping("getBoardList.do")
	public ModelAndView getBoardList(String searchCondition, String searchKeyword) {
		System.out.println(searchCondition+ ":" +searchKeyword);
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardList",boardService.getBoardList(map));		
		mv.setViewName("getBoardList");
		return mv;
		
		
		/*@RequestMapping("modelandview.do")
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
		}*/
	}
	//하나의 리스트 목록 확인
	@RequestMapping("getBoard.do")
	public void getBoard(BoardVO vo, Model m) {
		//인자로 String seq로 받아도 되지만 VO(DTO)로 받아도 됨
		BoardVO result = boardService.getBoard(vo);
		boardService.updateCnt(result);
		m.addAttribute("board",result);	
	}
	
	@RequestMapping("deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	@RequestMapping("updateBoard.do")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);
		return "redirect:/getBoardList.do";
	}
}
