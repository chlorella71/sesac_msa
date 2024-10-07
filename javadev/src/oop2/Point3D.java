package oop2;

public class Point3D extends Point2D {
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x,y,z) 실행");
	}
	
	public Point3D() {	//Point3D가 실행되기 위해서는 super class인 Point2D가 실행이 되어야함
		this(1,2,3); // x,y,z를 1,2,3으로 초기화하고 싶다면 기존 생성자 활용
		System.out.println("Point3D() 실행");
	}

}
