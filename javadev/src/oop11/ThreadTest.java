package oop11;

class MyClass{
	
}

//public class ThreadTest extends Thread{	//단일스레드를 멀티스레드로 바꾸는법 :thread상속후 인스턴스 생성
public class ThreadTest extends MyClass implements Runnable{	//thread 클래스를 상속받을수없을때는 runnable interface활용
//그럼 runnable이super, thread가 subtype이 되어 upcasting으로 활용가능?
//가능한 이유 thread가 runnable을 구현하도록 설계해두었기 때문?
	//runnable인터페이스는 멀티스레드가 실행이 될때 run()메서드가 구현되도록 강제하는 클래스?
	public void run() {
		for (int i =1; i<=5; i++) {
			System.out.println("run: " + i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("run 종료");
	}
	public static void main(String[] args) {
		
//		ThreadTest t = new ThreadTest(); // ? 이 코드 확실하지않음
		Runnable r = new ThreadTest();
//		t.start();
		Thread t = new Thread(r);
		t.start();
		
		for (int i =1; i<=5; i++) {
			System.out.println("main: " + i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 종료");
	}
}
