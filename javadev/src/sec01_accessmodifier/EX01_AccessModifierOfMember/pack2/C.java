package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class C {
	public void print() {
		
	//객체 생성
	A a = new A();
	//멤버활용
	System.out.print(a.a+" ");
//	System.out.print(a.b+ " ");	//다른패키지 내의 클래스에서는 자식 클래스가 아닐때는 public접근지정자만 사용가
//	System.out.print(a.c+" ");
//	System.out.print(a.d+ " ");
	System.out.println();
	}
}
