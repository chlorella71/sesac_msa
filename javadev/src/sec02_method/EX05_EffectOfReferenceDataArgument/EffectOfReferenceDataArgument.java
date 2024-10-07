package sec02_method.EX05_EffectOfReferenceDataArgument;

import java.util.Arrays;

/* 참조자료형 매개변숫값의 변화 */
public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
//		printArray(array);
		
		modifyData(array);
		
		printArray(array);
	}
	
	public static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
//		printArray(a);
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
