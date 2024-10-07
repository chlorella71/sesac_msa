package method;

public class MethodTest6 {
	public static void main(String[] args) { //method Overloading
		print(1);
		print(2,3);
		print(4,5,6, 13,12,4,2315,235,15,234,64,536,3457,456,867,8,769,5,4,67,6573,456,3456,436,24,543,5,134,123,4234,656,857,69,80,7980,5,765,7345,65243,513,413);
	}

	private static void print(int... i) { 
		// TODO Auto-generated method stub
		for(int j:i) {
			System.out.print(j + "\t");
		}
		System.out.println();

		
	}

//	private static void print(int i) {
//		// TODO Auto-generated method stub
//		System.out.println(i);
//		
//	}
//
//	private static void print(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println(i+ "\t"+j);
//		
//	}
//
//	private static void print(int i, int j, int k) {
//		// TODO Auto-generated method stub
//		System.out.println(i+"\t"+j+"\t"+k);
//		
//	}
}