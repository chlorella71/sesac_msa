package control;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("score> ");
		
		int score = sc.nextInt();
		
		if(score <= 100 && score >= 90) {
			System.out.println('A');
		} else if(score < 90 && score >= 80) {
			System.out.println('B');
		} else if (score < 80 && score >= 70) {
			System.out.println('C');
		} else if (score < 70 && score >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
		System.out.println("종료");
	}
}
