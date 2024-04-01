package classes;

public class Person {

	// 설계도
	// 멤버 필드(속성)_인스턴스 변수
	private String name; // 캡슐화
	private int age;
	private char gender;

	//리턴형타입이 존재한다.
	public String getName() {
		return this.name;
	}//return은 메서드 종료
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	
	
	

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		

		this.name = name; 

	}

}
