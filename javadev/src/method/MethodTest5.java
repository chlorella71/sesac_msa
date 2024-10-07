package method;

public class MethodTest5 {
	public static void main(String[] args) {
		int a = 10;
		
		int b = square(a); //square: 제곱
		
		System.out.println(a); // square()의 int a 는 a *a가 됐지만 main()의 int a의 값은 그대로
		System.out.println(b);
	}

	private static int square(int a) { // call by value
		// TODO Auto-generated method stub
		a = a * a;
		return a;
	}
}
