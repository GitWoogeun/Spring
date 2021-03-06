package ex05_autowired;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageBeanImpl implements MessageBean{

	private String name;
	private String message;
	
			
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	//@Autowired
	//Autowired = 자동으로 지정된 out의 파일 생성
	//@Qualifier("out2") 
	//Qualifier = 해당 out이 아닌 지정된 out2로 파일이 생성
	
	@Resource(name="out2")
	private Outputer out;
	/* 멤버 지정
	 * 1.생성자 함수
	 * 2.setter
	 * 3.@Autowired
	 */
	
	@Override
	public void sayHello() {
		System.out.println(name+"님께 "+message);
		try {
			out.writeMessage(name+"님께"+message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
