package control;

public class DoWhileTest1 {
	public static void main(String[] args) {
		int i = 5;
		do{
			System.out.println(i*100+":안녕하세요");
			i+=1;
		}while(i<=3);
		System.out.println("종료");
	}
}
