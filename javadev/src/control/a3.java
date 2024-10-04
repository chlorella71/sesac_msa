package control;

public class a3 {
	public static void main(String[] args) {
		for (int k = 2; k<=6; k+=4) {
			for (int i =1; i <= 9; i++) {
				for (int j = k; j<=k+3; j++) {
					System.out.print(j+"*"+i+"="+i*j +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}