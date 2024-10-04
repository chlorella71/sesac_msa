package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		//반복 회수가 0일때 do-while문과 while문 비교
		int a;
		a=0;
		while(a<0) {
			System.out.print(a + " ");
			a++;
		}	//실행횟수 0
		System.out.println();
		a = 0;
		do {
			System.out.print(a +" ");
			a++;
		} while(a < 0);	//실행횟수 1
		System.out.println();
		
		//반복 횟수가 1일때 do-while문과 while문 비교
		
		a=0;
		while(a<1) {
			System.out.print(a + " ");
			a++;
		}	//실행횟수 1
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while(a <1); // 실행횟수 1
		System.out.println();
		
		//반복횟수가 10일때 do-while문과 while문 비교
		a = 0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}	//실행횟수 10번
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while(a < 10); // 실행 횟수 10번
	}
}
