package method;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      while (true) {
	         System.out.print("가위는 1, 바위는 2, 보는 3 입력> ");
	         int you = sc.nextInt();
	         int com = (int) (Math.random() * 3) + 1;
//	         System.out.println("You : " + you);
	         
	         System.out.print("You : "); rspCaption(you);
	         
	         System.out.print("Com : "); rspCaption(com);
	         
	         int result = (you - com + 3) % 3;
	         if (result == 0) {
	            System.out.println("Tie");
	         } else if (result == 1) {
	            System.out.println("You win");
	         } else {
	            System.out.println("Computer wins");
	         }
	         System.out.println("end");
	      }

		
	}

	private static void rspCaption(int value) {
		// TODO Auto-generated method stub
		switch (value) {
        case 1: System.out.println("가위"); break;
        case 2: System.out.println("바위"); break;
        case 3: System.out.println("보"); break;
        default: System.out.println("에러"); break;
        }
		
	}
}
