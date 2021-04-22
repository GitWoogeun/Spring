package ex04_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ex04_annotation/applicationContext.xml");
		
		MemberDAO dao = context.getBean("memberDAO",MemberDAO.class);
		dao.insert();
	}
}
