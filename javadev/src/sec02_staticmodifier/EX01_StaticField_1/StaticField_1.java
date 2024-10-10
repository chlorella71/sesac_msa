package sec02_staticmodifier.EX01_StaticField_1;

class A {
	int m = 3; 	//인스턴스  필드
	static int n = 5; //정적필드
}
	
public class StaticField_1 {
	public static void main(String[] args) {
		//인스턴스필드활용방법(객체를생성한후사용가능)
		A a1=new A();
		System.out.println(a1.m);
		
		//정적필드활용방법
		//1. 객체생성없이 클래스명으로 바로 활용
		System.out.println(A.n);
		//2. 객체를 생성한 후 활용(권장하지않음)
		A a2 = new A();
		System.out.println(a2.n);
	}
}
