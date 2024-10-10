package oop9;

public class BoxedPrimitivesTest {
	public static void main(String[] args) {
		
	/*
	Integer i1 = new Integer("10"); // Integer i1 = 10; //Auto Boxing, 이 표현이 오류나면 컴파일러 설정을 다시해야함
	int i2 = i1;	//Auto unboxing
	*/
//	Integer n1 = 127;	
//	Integer n2 = 127;
//	System.out.println(n1 == n2);
		Integer n1 = Integer.valueOf(127);	
		Integer n2 = Integer.valueOf(127);
		System.out.println(n1 == n2);	//주소비교, 잘못된표현이지만 true가 나오는 이유: -128~127까지의 수는final area에 상수로 정의해두어 stack에서 그 값을 참조하기 때문?
		System.out.println(n1.equals(n2)); //값비교
	
	Integer n3 =128;
	Integer n4 =128;
	System.out.println(n3 == n4);	//128은 인스턴스 비교라 false가 잘 나오게됨
	System.out.println(n3.equals(n4));
	}
	
}
