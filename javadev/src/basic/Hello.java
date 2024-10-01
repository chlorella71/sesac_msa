package basic;
/*
 * 켈리 방정식 테스트
 * 윤권 	2024-09-30 ...메서드 추가
 * 
 */
public class Hello {
	public static void main(String[] args) {
		double money = 1_000_000;
		
		for(int i =1; i <=50; i++) {
			money = money + (money/2 * 0.4);
			money = money - (money/2 * 0.3);
			System.out.println(money);
		}
	}
}
