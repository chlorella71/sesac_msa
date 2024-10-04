package control;

import java.util.Scanner;

public class SwitchTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1,2,3,4 중 1개 입력> ");
		int n = sc.nextInt();
		
		String gubun = switch(n) {
		case 1, 3 -> "남자";
		case 2, 4 -> "여자";
		default -> "에러";
		};
		System.out.printf("주민번호 7번째 숫자가 %s면 %s입니다\n", n, gubun);
		System.out.println("종료");
	}

}
