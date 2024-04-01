package main;

import fields.Member02;

public class MemberTest01 {

	public static void main(String[] args) {

		Member02 mem = new Member02();

		// men.no 불가능, private로 되어있어서
		// mem.email 불가능, package가 달라서 불가능
		// mem.pass 불가능, 다른 공간이며 상속되어 있지 않아 불가능
		System.out.println(mem.name); // 사용가능, public(공유)

		Sub sub = new Sub();
		sub.disp();

	}

}
