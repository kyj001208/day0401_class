package fields;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Member {
	
	//멤버 필드 //클래스 내부
	private long no; 								//회원번호
	private String email;	//	package 는 생략가능		//회원아이디
	private String pass;							//비밀번호
	private String name;							//이름
	private LocalDateTime createdAt;					//회원가입일
	

	
	public void print() {
		System.out.println("회원번호" +no);
		System.out.println("이메일" + email);
		System.out.println("비밀번호" + pass);
		System.out.println("이름" + name);
		System.out.println("생성일자" + createdAt);
	}

	//getter
	public long getNo() {
		return no;
	}
	//setter
	public void setNo(long no) {
		this.no=no;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass=pass;
				
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
				
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt=createdAt;
				
	}

}
