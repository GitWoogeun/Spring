package ex02_value_ref;

public class MemberDAO {
	
	private MemberBean bean;
	
	//기본 생성자
	public MemberDAO() {}
	
	// 1. 생성자 
	public MemberDAO(MemberBean bean) {
		this.bean = bean;
	}
	
	//setter
	public void setBean(MemberBean bean) {
		this.bean = bean;
	}
	
	public void insert() {
		System.out.println(bean.getName()+"님의 메세지"
					+bean.getMessage()+"를 입력했습니다.");
	}
}
