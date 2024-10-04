package control.loop;

public class Star3 {
	public static void main(String[] args) {
		for(int i = 1; i <=5; i++) {
			for(int j =1 ; j <=5; j++) {
				if (j >= i )System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("종료");
	}
}

/*

*****	1행은 1열까지 * 출력
 ****  2행은 2열까지 * 출력
  ***	n행은 n열까지 * 출력
   **
    *

j >= i 일때 * 출력 else " "출력함


텍스트 모드에서는(CLI) 행부터 출력할 수 없음 열먼저 출력함

*/