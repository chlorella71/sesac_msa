package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[] args) {
		//배열을 입력매개변수로 하는 메서드 호출
		int[] a = new int[] { 1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});
		//print Array({1,2,3}	// 오류발생
		
		System.out.println(a[0]);
		}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		a[0] = 100;
		System.out.println(Arrays.toString(a));
		
	}
}
