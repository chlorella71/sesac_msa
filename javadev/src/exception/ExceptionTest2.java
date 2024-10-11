package exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		String str = null; //"hello";
		try {
			System.out.println(str.toString());	// throw new NullPointerException();
			System.out.println("try 종료. 예외발생하지않음");
		}catch (NullPointerException e) {
			System.out.println("null 예외처리");
			e.printStackTrace();
		} catch (Exception e) {	//upcasting
			System.out.println("그외예외처리");
			e.printStackTrace();
		} finally {
			System.out.println("finally 블럭");
		}
		System.out.println("종료");
	}
}
