package method;

public class Calculator01 {

	public static void main(String[] args) {
		
		
		Calculator cal=new Calculator(); //객체 생성
		
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.minus(10, 20));
		System.out.println(cal.multifly(10, 20));
		System.out.println(cal.division(10, 20));
		
		cal.println(10);
		cal.println("문자열");
		
	}

}
