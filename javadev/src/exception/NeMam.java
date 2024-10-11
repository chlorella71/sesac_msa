package exception;

public class NeMam implements AutoCloseable{	//try구문을 빠져나가게 되면 자동으로 close()를 실행하도록 해줌

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("NeMam 자원을 해제합니다.");
		
	}

}
