package sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

class A {
	int a =3; //필드
	void abc() {
		int b =5; //지역변수
		// 지역 이너 클래스
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;	// 아우터 클래스의 필드의 값은 수정할 수 있음
//				b = 7;
				// 지역 이너클래스에서
				//로컬변수는 메서드가 끝나면 사라지지만 생성된 객체는 다른 곳에 참조될 수 있다 
				// 그래서 지역 이너 클래스에서 메서드의 지역 변수를 참조하면 
				// 메서드의 지역변수에 final이 자동으로 붙게 되어 지역이너클래스에서 값을 수정할 수 없음
			}
		}
		B bb = new B();
		bb.bcd();
	}
}
public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
