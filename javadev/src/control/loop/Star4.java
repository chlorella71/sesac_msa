package control.loop;

public class Star4 {
	public static void main(String[] args) {
		for(int i = 1; i <=5; i++) {
//			for(int j =1 ; j <=5; j++) {
//				if (j <= 5-i) System.out.print(" ");
//				else System.out.print("*");
//			}
//			System.out.println();
			
			for(int j =1 ; j <=5; j++) {
				if (j + i < 6) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("종료");
	}
}

/*
단순 숫자맞추기가 아니라 결과값을 나열해보면서 규칙을 찾는 연습을 해야함
    *	1행: 5열부터 *출력
   **	2행: 4열부터 *출력
  ***	3행: 3열부터 *출력
 ****	4행: 2열부터 *출력
*****	5행: 1열부터 *출력

1행은 if j <= 5-i일때는 " ", else "*" 출력
또는
if i + j >= 6일때 * 출력, else " "출력
텍스트 모드에서는(CLI) 행부터 출력할 수 없음 열먼저 출력함

*/