package ex03_pvalue;

public class MemberBean {
	private String name;
	private int age;
	private String message;
	
	
	public void output() { 
		System.out.println("이름 :"+name+"["+"나이 :"+age+"] : "+message);
	}

	//기본 생성자
	public MemberBean() {}
	
	//--------------------------------
		//사용자 생성자		
	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}
	
	
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
