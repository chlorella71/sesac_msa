package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 0~9까지 중복되지 않은 숫자 3개 맞추기
		int c1, c2, c3; // 컴퓨터가 생성할 0~9 사이의 중복되지 않은 숫자 3개를 저장할 변수
		
		c1 = (int)(Math.random() * 10);
		
		//do ~ while을 이용해 중복방지
		do {
			c2 = (int) (Math.random() * 10);
		} while (c2 == c1);
		
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c3 == c1 || c3 == c2);
		
		int S, B; // Strike, Ball
		
		int cnt = 0; // 시도한 횟수
		
		int n1, n2, n3;
		
		do {
			S = B = 0;	// S, B를 0으로 초기화
			
			System.out.print("0~9 사이의 중복되지 않은 숫자 3개 입력 ex. 1 2 3 > ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
			
			
			if (n1 == c1) {
				S++;
			} else if ( n1 == c2 || n1 == c3) {
				B++;
			}
			
			if (n2 == c2) S++;
			else if ( n2 == c1 || n2 == c3) B++;
			
			if (n3 == c1 || n3 ==c2 || n3 ==c3 ) {
				if (n3 == c3) {
					S++;
				} else {
					B++;
				}
			}
			
			cnt++;
			
			System.out.println("[" + S + "S" + B + "B]");
			
		} while(S != 3);
		
		System.out.printf("축하합니다 %s번만에 성공하셨습니다!", cnt);
	}

}
