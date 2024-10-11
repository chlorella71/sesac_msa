package exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("1초 후 종료");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName("java.lang.Object");	//throw new ClassCastException();
//		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (Exception e) {	//어떤 예외처리를해야할지 모르겠을때는 Exception으로 해주어도 됨, upcastiong
			System.out.println("잘못된클래스입니다...");
		}
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("...1");
		System.out.println("종료");
	}
}
