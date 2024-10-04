package control;

import java.util.Scanner;

public class IfTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력> ");
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		if (you - com == 0) {
			System.out.println("무승부");
		} else if(you - com == 1 || you - com == -2) {
			System.out.println("you승");
		} else {
			System.out.println("com승");
		}
		System.out.printf("com: %s\n", com);
		
		System.out.println("종료");
		sc.close();
	}
}
