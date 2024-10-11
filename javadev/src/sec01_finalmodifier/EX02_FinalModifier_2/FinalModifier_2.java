package sec01_finalmodifier.EX02_FinalModifier_2;


class A {
	void abc() {}
	final void bcd() {}
}
class B extends A {
	void abc() {}
//	void bcd() {} // final메서드는 오버라이딩 불가능
}
final class C {}
//class D extends C {} //final클래스는 상속자체가 불가능
public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}

}
