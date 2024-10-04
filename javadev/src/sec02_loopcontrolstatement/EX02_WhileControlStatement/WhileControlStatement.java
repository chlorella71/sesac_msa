package sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {
	public static void main(String[] args) {
		//while 기본문법구조
		int a= 0;
		while(a <10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		//for문으로 변환
		for(int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int b = 10;
		while(b > 0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		
		//for문 변환
		for (int i = 10; i> 0; i--) {
			System.out.print(i + " ");
		}
		
//		//while문 무한루프
//		while(true) {
//			System.out.println("무한루프");
//		}
		System.out.println();
		
		//무한루프탈출
		int c = 0;
		while(true) {
			if (c > 10) {
				break;
			}
			System.out.print(c + " ");
			c++;
		}
	}
}
