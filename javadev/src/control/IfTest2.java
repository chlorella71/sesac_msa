package control;

public class IfTest2 {
	public static void main(String[] args) {
		int n = 1;
		
		if (n==2 || n==3) {
			System.out.println("M");
		} else if (n==2 || n==4){
			System.out.println("F");
		} else {
			System.out.println("E");
		}
		System.out.print("종료");
	}
}
