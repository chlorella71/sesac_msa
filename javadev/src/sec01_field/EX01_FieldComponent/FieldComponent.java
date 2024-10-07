package sec01_field.EX01_FieldComponent;

//클래스 생성
class A {
	int m = 3; // 필드
	int n = 4; // 필드
	void work1() {
		int k = 5; // 지역변수
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j =4;
		System.out.println(i + j);
	}
}

public class FieldComponent {
	public static void main(String[] args) {
		//클래스로 객체 생성
		A a = new A();
		System.out.println("a : " + a);
		System.out.println(a.hashCode());
		//필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		//메서드호출
		a.work1();
		System.out.println("end");
	}

}
