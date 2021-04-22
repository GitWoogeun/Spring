package ex04_annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberBean {
	private String name;
	private int age;
	private String message;
	
	
	public void output() { 
		System.out.println("이름 :"+name+"["+"나이 :"+age+"] : "+message);
	}

	//기본 생성자
	public MemberBean() {
		this.name="X맨";
		this.age=44;
		this.message = "오늘도 즐겁게";
	}
	
	//--------------------------------
	//생성자		
//	public MemberBean(String name, int age, String message) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.message = message;
//	}
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMessage() {
		return message;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setMessage(String message) {
		this.message = message;
	}
				
}
