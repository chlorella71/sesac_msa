package oop7;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		printArea(c);
		
		Rectangle r = new Rectangle();
		printArea(r);
		
//		Triangle t = new Triangle();
//		printArea(t);
		printArea(new Triangle());
	}

//	private static void printArea(Triangle t) {
//		// TODO Auto-generated method stub
//		t.area();
//		System.out.println("삼각형의 넓이는 "+ t.res);
//		
//	}
//
//	private static void printArea(Rectangle r) {
//		// TODO Auto-generated method stub
//		r.area();
//		System.out.println("사각형의 넓이는 "+ r.res);
//		
//	}
//
//	private static void printArea(Circle c) {
//		// TODO Auto-generated method stub
//		c.area();
//		System.out.println("원의 넓이는 " + c.res);
//		
//	}
		private static void printArea(Shape s) {
			// TODO Auto-generated method stub
			s.area();
			if (s instanceof Circle) {
				Circle c = (Circle)s;
				System.out.println("반지름 "+c.r+"인 원의넓이는 "+c.res);
			} else if (s instanceof Rectangle) {
				Rectangle r= (Rectangle) s;
				System.out.println("가로 "+r.w+",세로 "+r.h+"인 사각형의 넓이는 "+r.res);
			} else if (s instanceof Triangle) {
				Triangle t = (Triangle) s;
				System.out.println("밑변 "+ t.w+",높이 "+t.h+"인 삼각형의 넓이는 "+t.res);
			}
			
		}
	
	
}
