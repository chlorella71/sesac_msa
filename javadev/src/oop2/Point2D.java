package oop2;

//public class Point2D extends Object{
public class Point2D {

	int x;
	int y;
	
	public Point2D() {
		this(10, 20);	// 생성자에서 다른 생성자를 호출할때는 항상 제일 앞에 와야함
		System.out.println("Point2D() 실행");
	}

	public Point2D(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y)실행");
	}

	
	

}
