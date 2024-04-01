package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import fields.Member;

public class Member03 {

	public static void main(String[] args) {
		// 회원가입을 위한 정보 수집
		//키보드에서 각각 입력받고 출력하는 프로그램
		
		Scanner in=new Scanner(System.in);
	
		
		//회원번호 숫자로 입력하여 회원객체에 저장 
		Member mem=new Member(); //객체 생성
		
		System.out.println("회원번호 입력");
		long no=in.nextLong();
		mem.setNo(no);
		
		//이메일, 비밀번호, 이름 각각 입력받으세요
		
		System.out.println("이메일 입력");
		String email=in.next();
		mem.setEmail(email);
		
		System.out.println("비밀번호 입력");
		String pass=in.next();
		mem.setPass(pass);	
		
		System.out.println("이름 입력");
		String name=in.next();
		mem.setName(name);	
		
		in.close();
		
		
		LocalDateTime now=LocalDateTime.now(); //현재 시스템의 날짜 정보를 생성
		mem.setCreatedAt(now);
		
		//멤버에 저장된 값들을 출력하세요
		
		//System.out.println("회원번호" + mem.getNo());
		//System.out.println("이메일" + mem.getEmail());
		//System.out.println("비밀번호" + mem.getPass());
		//System.out.println("이름" + mem.getName());
		//System.out.println("생성일자" + mem.getCreatedAt());

		mem.print(); //메서드를 활용하여 프린트 출력 방법
	}

}
