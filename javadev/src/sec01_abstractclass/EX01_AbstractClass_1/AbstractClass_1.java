package sec01_abstractclass.EX01_AbstractClass_1;

abstract class A {
	abstract void abc();
}

class B extends A {
	void abc() {
		System.out.println("방법1. 자식클래스생성 및 추상메서드구현");
	}
}


public class AbstractClass_1 {
	public static void main(String[] args) {
		//객체생성
		A b1 = new B();
		A b2 = new B();
		
		//메서드호출
		b1.abc();
		b2.abc();
	}
}
