package sec02_exceptionhandlingsyntax.EX03_MultiCatch_2;

public class MultiCatch_2 {
	public static void main(String[] args) {
		/*
		//1. catch블록의 순서가 잘못됐을때
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch (Exception e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		catch (NumberFormatException e) {	// unreachable code 오류 발생
			System.out.println("숫자로 바꿀 수 없습니다.");
		}
		finally {
			System.out.println("프로그램 종료");
		}
		*/
		
		//2. catch블록의 올바른순서
				try {
					System.out.println(3/1);
					int num = Integer.parseInt("10A");
				}
				catch (NumberFormatException e) {	// unreachable code 오류 발생
					System.out.println("숫자로 바꿀 수 없습니다.");
				}
				catch (Exception e) {	//if문의 else{}와 같은 역할
					System.out.println("숫자는 0으로 나눌 수 없습니다.");
				}
				finally {
					System.out.println("프로그램 종료");
				}
	}

}
