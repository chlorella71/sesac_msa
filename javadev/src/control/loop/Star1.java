package control.loop;

public class Star1 {
	public static void main(String[] args) {
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("종료");
	}
}

/*

*****	1행은 5열까지 * 출력
****  2행은 4열까지 * 출력
*n	n행은 6-n열까지 * 출력


텍스트 모드에서는(CLI) 행부터 출력할 수 없음 열먼저 출력함

*/