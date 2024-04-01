package classes;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person(); //객체 호출
		Person p2=new Person();
		Person p3=new Person();
		
		
		//p1.name="박효신"; , name 변수가 private이기때문에 불가능
		
		
		p1.setName("박효신"); // setName 경우 public(공유)가능하기에 접근 가능
		//메서드 호출 : 메서드가 실행된다.
		p1.setGender('M');
		p1.setAge(30);
		
		p2.setName("김지원");
		p2.setGender('F');
		p2.setAge(28);
		
		p3.setName("김유진");
		p3.setGender('F');
		p3.setAge(00);
		
	
		
	}

}
