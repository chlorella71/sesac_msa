package basic;

public class StringTest3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		printStr(sb);
		sb.append("실수란 ");printStr(sb);
		sb.append("신을 용서하는 ");printStr(sb);
		sb.append("인간의 ");printStr(sb);
		sb.append("행위이다. ");printStr(sb);
		System.out.println("end");
	}
	
	private static void printStr(StringBuilder sb) {
		System.out.println(sb.capacity()+":"+sb.length()+":"+sb);
		//.capacity() : 미리 메모리를 확보해두는 메서드
	}
}
