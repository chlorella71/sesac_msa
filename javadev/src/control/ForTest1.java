package control;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("score> ");
		
		for(int i =1 ; i<=3; i++) {
			System.out.println(i + ":새싹");
		}
		System.out.println("종료");
		
		sc.close();
	}
}