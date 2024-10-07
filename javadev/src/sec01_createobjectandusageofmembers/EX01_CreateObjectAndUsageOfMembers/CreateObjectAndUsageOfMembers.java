package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

//클래스 (붕어빵기계)정의
class A {
	int m = 3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		//클래스로 객체(붕어빵)생
		A a= new A();
		
		//클래스멤버활용(붕어빵먹기)
		//@필드활용: 필드에 값을 읽기/쓰기
		a.m= 5;
		System.out.println(a.m);
		
		//@메서드활용: 메서드를 호출
		a.print();
		
	}
}
