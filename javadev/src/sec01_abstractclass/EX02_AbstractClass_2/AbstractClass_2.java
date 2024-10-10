package sec01_abstractclass.EX02_AbstractClass_2;

abstract class A {
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		//	객체생성
		A a1 = new A() {
			void abc() {
				System.out.println("방법2. 익명이너클래스방법으로 객체생성");
			}
		};
		
		A a2 = new A() {
			void abc() {
				System.out.println("방법2. 익명이너클래스방법으로 객체생성");
			}
		};
		//메서드호출
		a1.abc();
		a1.abc();
	}
}
