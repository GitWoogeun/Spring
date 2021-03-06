package ex02_value_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ex02_value_ref/applicationContext.xml");
		
		//xml의 bean id값인 "member"가 MemberBean이라는 클래스 타입이라는걸 명시  
/*		MemberBean b = context.getBean("member",MemberBean.class);
		b.output();
		
		MemberBean b2 = context.getBean("member2",MemberBean.class);
		b2.output(); */
		
		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		dao.insert();
		
		MemberDAO dao2 = context.getBean("dao2",MemberDAO.class);
		dao2.insert();
	}
}
