package sec01_accessmodifier.EX02_AccessModifierOfClass_1;

public class AccessModifierOfClass_1 {
	public static void main(String[] args) {
		//객체 생성
		A a= new A();
		B b = new B();
		C c = new C();	// 같은패키지에서는 public클래스와 default클래스의 타입 모두 객체를 선언할 수 있으며, public생성자와 default생성자 모두 호출 가능
	}
}
