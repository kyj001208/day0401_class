package classes;

public class Position {
	
	private int x;
	private int y; //캡슐화
	//정적(공유)필드
	static final double PI=3.141592;//필드 초기화
	
	//초기값을 무조건 넣어줘야함(필드 초기화, 생성자 초기화)
	
	public int getX() {
		
		return x;
		
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}

}
