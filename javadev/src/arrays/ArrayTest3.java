package arrays;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] score = {
				{100,90,80,70},
				{90,80,70,60},
				{80,70,60,50}
		};
		
		System.out.println(score.length);
		System.out.println(score[0].length);
		
	
//		System.out.println(Arrays.toString(score)); 
//		System.out.println(score.length); 
//		System.out.println(score[0].length); 
//		System.out.println(Arrays.toString(score[0])); 
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");

		int sum[] = {0, 0, 0};
		for(int row=0; row < score.length; row++) {
			for(int col=0; col < score[row].length; col++) {
				sum[row] += score[row][col];
				System.out.print(score[row][col] + "\t");
			}
			System.out.print(sum[row]+ "\t" + ((double) sum[row]/score[row].length));

			System.out.println();
		}
		
		
		System.out.println("end");
	}
}
