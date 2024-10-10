package sec01_accessmodifier.EX03_AccessModifierOfClass_2;	//클래스AA, BB, CC와 다른패키지에 위치함

import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;	//클래스AA와 클래스CC는 public접근지정자를 포함하고 있으므로 임포트 가능

public class AccessModifierOfClass_2 {

	public static void main(String[] args) {
		//객체생성
		AA a = new AA();	// 클래스AA는 public생성자이므로 다른 패키지에서도 객체선언(AA a)과 생성자호출(new AA())가능
//		BB b = new BB();	//클래스 BB는 임포트할 수 없으므로 객체 선언과 생성자 호출 모두 불가능
//		CC c = new CC();	//클래스 CC는 객체는 선언할 수 있지만(CC c),default생성자이므로 생성자 호출(new CC())불가능
	}
}
