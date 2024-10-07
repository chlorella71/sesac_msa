package sec03_constructor.EX01_DefaultConstructor;

class A {
	int m;
	void work() {
		System.out.println(m);
	}
	
//	A() { // 생성자를 포함하지 않으면 컴파일러가 기본생성자를 자동으로 추가
//		
//	}
}

class B {
	int m;
	void work() {
		System.out.println(m);
	}
	B() {
		
	}
}

class C {
	int m;
	void work() {
		System.out.println(m); // 생성자로 넘어온 값
	}
	C(int a) {
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		//클래스의 객체 생성
		A a = new A(); // 컴파일러가 자동으로 추가한 기본생성자를 호출해 객체생성
		B b = new B();	// 직접 정의한 기본 생성자를 호출해 객체 생성
//		C c = new C(); //기본생성자 호출불가능, 직접 정의한 생성자를 호출해 객체 생성
		C c = new C(3);
		
		// 메서드 호출
		a.work();
		b.work();
		c.work();
	}

}
