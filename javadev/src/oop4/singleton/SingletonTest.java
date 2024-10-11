package oop4.singleton;

class Single {	// 이 클래스가 무언가 기능을 수행하기보단 값을 뿌리기만 하는 역할이라면 인스턴스를 여러번 생성하는 것은 비효율적?
	private static Single single = null; // 공유 변수로 자기 자신을 참조하는 변수 만들기
	
	private Single() {}	// 쉽게접근할 수 없는 메서드 만들기. 이 메서드로만 호출해서 사용하기위함??????
	
	public static Single getInstance() { // 객체가 없다면 1번만 생성하도록 하기?
		if (single == null) {
			single = new Single();
		}
		return single;
	}
}

public class SingletonTest {	//Singleton
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); //hashCode가 같다고해서 꼭 같은 값을 가지는 것은 아님. hashCode는 4byte이기 때문에 그 이상의 양은 정확히 구분할 수 없기 때문임.
		
	}
}
