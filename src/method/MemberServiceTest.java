package method;

import java.time.LocalDateTime;
import java.util.Scanner;

import fields.Member;

public class MemberServiceTest {
	
	public static void main(String[] args) {
		
		MemberService service=new MemberService();
		Member member=new Member();
		member.setNo(1);
		member.setEmail("test01@naver.com");
		member.setPass("1234");
		member.setName("테스트");
		member.setCreatedAt(LocalDateTime.now());
		
		service.setMember(member);
		
		//키보드에서 입력하여 로그인 시도하세요
		
		Scanner in=new Scanner(System.in);
		System.out.println("이메일을 입력하세요");
		String email=in.next();
		System.out.println("비밀번호를 입력하세요");
		String pass=in.next();
		boolean result=service.login(email, pass);
		
		if(result) {
			System.out.println("로그인 성공");
		}else {
			
			System.out.println("이메일 또는 비밀번호가 일치하지 않습니다");
		}
	
	}

}
