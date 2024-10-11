package exception;

import java.io.IOException;

public class ExceptionTest4 {
	public static void main(String[] args) {
		try {
			runMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}
	private static void runMethod() throws IOException {
		if (true) throw new IOException("파일처리 예외상황발생~!");
		System.out.println("runMethod end");
	}
}
