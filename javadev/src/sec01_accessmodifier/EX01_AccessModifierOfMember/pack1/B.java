package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	public void print() {
	//객체 생성
	A a = new A();
	//멤버활용
	System.out.print(a.a+" ");
	System.out.print(a.b+ " ");
	System.out.print(a.c+" ");
//	System.out.print(a.d+" "); // private접근지정자로 지정된 필드는 접근 불가능
	System.out.println();
	}
	
}
