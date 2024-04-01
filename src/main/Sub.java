package main;

import fields.Member02;

public class Sub extends Member02 {//상속 표현(extends)
	
	String name;
	public void disp() {
		
		//System.out.println(no); 불가능, private
		//System.out.println(email); 불가능, 같은 공간 x
		System.out.println(super.name); //가능, 같은 공간은 아니지만 상속되어 있어 가능
		
		
	}
}
