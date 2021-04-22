package ex04_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	//스프링 니가 객체를 생성했으니까 그 객체를 나한테 넣어줘
	@Autowired
	private MemberBean bean;
	/**** injection :
	 *  - 생성자도 없고, setter 없고 private 상황에서 주입*/
	
	
	
	//기본 생성자
//	public MemberDAO() {} 
//	public MemberDAO(MemberBean bean) {
//		this.bean = bean;
//	}
	
	//setter
//	public void setBean(MemberBean bean) {
//		this.bean = bean;
//	}
	
	public void insert() {
		System.out.println(bean.getName()+"님의 메세지"
					+bean.getMessage()+"를 입력했습니다.");
	}
}
