package classes;

public class PersonTest02 {

	public static void main(String[] args) {
	
		Person p1=new Person();
		p1.setName("조인성");
		p1.setAge(20);
		p1.setGender('M');

		// System.out.println(p1.name); 해당 name은 private가 붙은 name으로 출력 X
		
		String name = p1.getName();
		System.out.println(name);
		System.out.println(p1.getName());
		
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		
	}

}
