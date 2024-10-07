package sec05_thismethod.EX01_ThisMethod_1;


//클래스 정의
class A {
	A() {
		System.out.println("첫번쨰 생성자");
	}
	A(int a) {
		this();
		System.out.println("두번쨰생성자");
	}
//	void abc() {	//메서드에서는 this()메서드 사용 불가능
//		this();
//	}
}
public class ThisMethod_1 {
	public static void main(String[] args) {
		//객체생성
		A a1 = new A();
		System.out.println();
		A a2 = new A(3);
	}

}
