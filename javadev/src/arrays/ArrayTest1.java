package arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] n; // 4byte타입의 연속적인 공간 선언
		n = new int[3];
		n[0] = 100;
		n[1] = 200;
		n[2] = 300;
		//int[] n = new int[] {100, 200, 300};
		//int[] n = {100,200,300};
		System.out.println(n.length); //.length: 배열의 길이
		
		int len = n.length; // n.length는 heap을 참조하기는 것이기 때문에 변수에 담아놓고 사용하는 것이 좋
		for(int i = 0; i< len; i++) {
			System.out.println(n[i]);
		}
		System.out.println("end");
	}
}
