package oop5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1);
		
//		Bird bird1 = a1; // 오류 // supertype의 instance를 subtype에서 참조하는 것은 안됨
//		Bird bird2 = (Bird) a1; // 강제형변환은 되지만 실행하면 runtime에서 오류발생
		
		if (a1 instanceof Bird) {	// false일 경우 처리를 해두면 오류 발생은 막을 수 있긴함
			Bird bird3 = (Bird) a1;
			System.out.println(bird3);
		} else {
			System.out.println("다운캐스팅이 되지 않아요.");
		}
		
		Animal b1 = new Bird();	//subtype의 instace를 supertype에서 참조하는 것은 항상 가능 
		System.out.println(b1);
		
		Bird b2= new Bird();
		System.out.println(b2);
		
		Animal a2 = b2;		// upcasting은 가능
		System.out.println(a2);
		
		if (a2 instanceof Bird) {	//a2의 실체는 Birdtype이기 때문에 가능함
			Bird b3 = (Bird) a2;
			System.out.println(b3);
		} else {
			System.out.println("다운캐스팅 불가");
		}
		
		Condor c1 = new Condor();
		System.out.println(c1);
		Bird b4 = c1;	//upcasting
		System.out.println(c1);
		
		if(c1 instanceof Bird) {
			Bird b5 = c1;
			System.out.println(b5);
		} else {
			System.out.println("업캐스팅X");
		}
		
		Animal a3 = c1; //upcasting	
		System.out.println(a3);
		
		Bird b6 = (Bird) a3;	//downcasting은 강제형변환해주어야함. a3은 Bird의 subtype인 c1을 참조하고 있으므로 Condor의 suptype인 Bird로 재참조 가
		if (a3 instanceof Bird) {
			Bird b7 = (Bird)a3;
			System.out.println(b7);
		} else {
			System.out.println("다운캐스팅이 되지 않을까?");
		}
		
		
		Bird b7 = new Bird();
		Animal a4 = b7;
//		Condor c2 = (Condor) a4;	 // 실행하면 runtime에러에서 ClassCastException 발생
		System.out.println(a4);

		if ( a4 instanceof Condor) {
			Condor c3 = (Condor) a4;
			System.out.println(c3);
		} else {
			System.out.println("다운캐스팅 안됨, 실체가 Bird의 인스턴스이기 때문");
		}
		
		Condor c4 = new Condor();
		Bird b8 = c4;
//		System.out.println(b8);
		if (b8 instanceof Duck) {
			Duck d = (Duck) b8;
			System.out.println(d);
		} else {
			System.out.println("다운캐스팅 안됨");
		}
		System.out.println();
		System.out.println("종료");
	}
}
