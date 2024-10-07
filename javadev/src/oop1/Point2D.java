package oop1;

public class Point2D {
	private int x; //필드
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		System.out.println("x = "+getX());
		System.out.println("y = "+getY());
	}
	
	
	/*
	public void setX(int x) {
		this.x =x; //매개변수와 클래스의 필드를 구분하기위해 this.사용 /x는 setX()의 int x, this.x는 class Point2D의 필드를 가리킴
	}
	
	public int getX() {
		return x;
	}
	*/
	
}
