package ex01_xml1;

public class MessageBeanKoImpl implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println(name+"님 맛점 합시다.");
	}
	
	//MessageBeanKoImpl의 생성자 propertype이라 호출할때마다 생성자가 호출이되서 ㅎㅎㅎㅎㅎㅎㅎ가 출력이된다.
	public MessageBeanKoImpl() {
		System.out.println("ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ");
	}

}
