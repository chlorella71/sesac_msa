package sec01_packageimport.EX01_PackageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {
		//객체생성
//		A a = new A();	// 오류
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//멤버활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
