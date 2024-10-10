package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A{
	public void print() {
		//멤버활용
		System.out.print(a+" ");
		System.out.print(b+" ");
//		System.out.print(c+" ");	//자식클래스는 다른 패키지에 있어도 객체의 생성없이 protected 접근지정자 필드까지 접근가능
//		System.out.print(d);
		System.out.println();
	}

}
