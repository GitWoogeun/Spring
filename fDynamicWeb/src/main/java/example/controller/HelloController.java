package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * MVC에서 C(controller)가 서블릿이다.
 * 이 서블릿이 spring에 DispatcherServlet 파일이다.
 * 이 파일이 내가 지정한 요청 다시 호출해주는 구조이다.
 */
@Controller //컨트롤 역활한다고 스티커 붙여놓음 (DispatcherServlet)
public class HelloController {
	
	@RequestMapping("/start.do") //start.do요청이 들어오면 start()를 실행할거야
	public ModelAndView start() {
		System.out.println("start.do 요청 확인");
		// 뷰 페이지를 지정하고 뷰 단으로 데이타 전달
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","디벨롭킹");
		mv.addObject("message","이번주는 꼭 공부한다.");
		//mv.setViewName("/WEB-INF/view/hello.jsp");
		mv.setViewName("hello");
		return mv;
	}
}
