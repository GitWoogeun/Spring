package ex01_xml1;


public class MessageBeanEnImpl implements MessageBean{

	public void sayHello(String name) {
		System.out.println("Hello~~"+name);
	}
	
	//MessageBeanEnImpl의 생성자   //singleteon으로 생성했기 때문에 생성자를 1번만 호출 하고 다음부턴 호출이 되지 않는다.
	public MessageBeanEnImpl() {
		System.out.println("ㅋㅋㅋㅋㅋ");
	}
}
