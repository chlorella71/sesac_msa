package control;

public class ForTest3 {
	public static void main(String[] args) {
		// 1부터 1000까지 3의 배수의 합
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("종료");
	}
}