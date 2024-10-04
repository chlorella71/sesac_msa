package control;

import java.util.Scanner;

public class SwitchTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("score> ");
		
		int score = sc.nextInt();
		
		char grade = switch(score/10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
		System.out.printf("점수등급: %s\n", grade);
		
		System.out.println("종료");
	}
}
