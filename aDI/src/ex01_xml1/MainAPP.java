package ex01_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {

	public static void main(String[] args) {
		// 0. 기존 자바 방식 일명 POJO라고 함
		/*MessageBean bean = new MessageBeanKoImpl();
		  bean.sayHello("이민기");
		
		  MessageBean bean2 = new MessageBeanEnImpl();
		  bean2.sayHello("LeeMingy");
		*/
		
		
		//직접 객체를 생성하지 않고 bean으로 전달 받음(스프링방식)
		// 1. 스프링 박식
		// (1) 스프링 설정파일 연결
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ex01_xml1/applicationContext.xml");
		
		// (2) 컨테이너에서 빈 가져오기
		// context.getBean(기본 = Object타입)이라서 MessageBean타입으로 형변환 해줘야함
		// ko라는 이름으로 된 bean을 가져오기
		// en이라는 이름으로 된 bean을 가져오기  
		MessageBean bean = (MessageBean)context.getBean("ko");
		bean.sayHello("길동이");
		
		MessageBean bean2 = (MessageBean)context.getBean("en");
		bean2.sayHello("SMITH");

		MessageBean bean3 = (MessageBean)context.getBean("en");
		bean3.sayHello("SCOTT");
		
		MessageBean bean4 = (MessageBean)context.getBean("ko");
		bean4.sayHello("길동이");
	}
}
	