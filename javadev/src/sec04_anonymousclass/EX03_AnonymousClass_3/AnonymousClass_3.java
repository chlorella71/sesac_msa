package sec04_anonymousclass.EX03_AnonymousClass_3;
interface A{
	public abstract void abc();
}

//자식 클래스 생성
class B implements A {
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}
class C {
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass_3 {
	public static void main(String[] args) {
		C c = new C();
		//방법 1. 클래스명 O + 참조변수명 X
		A a = new B();
		c.cde(a);
		//방법2. 클래스명 O + 참조변수 명 O
		c.cde(new B());
	}
}
