package classes;

public class PositionTest01 {

	public static void main(String[] args) {
	
		Position pos1=new Position(); //객체생성
		
		pos1.setX(1);
		pos1.setY(1);
		
		Position pos2=new Position();
		
		pos2.setX(3);
		pos2.setY(2);
		
		int a=(pos2.getX() - pos1.getX());
		int b=(pos2.getY() - pos1.getY());
	
		
		System.out.println("X :" + pos1.getX());
		System.out.println("Y :" + pos1.getY());
		
		System.out.println("밑변 :" + a);
		System.out.println("높이 :" + b);
		
		
		double result=Math.sqrt(a*a+b*b);//메스 클래스 안에 있는 정적 메서드
	
		System.out.println(result);
		System.out.println(Math.PI);//static이 붙어있는 클래스 변수
		System.out.println(Math.E);//클래스 변수
		
		
	}

}
