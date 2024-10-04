package arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][][] score = {		//표, 행, 열
				{
					{100,90,80,70},
					{90,80,70,60},
					{80,70,60,50}
				},
				{
					{100,100,90,80},
					{100,90,80,70},
					{90,80,70,60}
				}
		};
	
//		System.out.println(Arrays.toString(score)); 
//		System.out.println(score.length); 
//		System.out.println(score[0].length); 
//		System.out.println(Arrays.toString(score[0])); 
		

		for(int row=0; row < score.length; row++) {
			for(int col=0; col < score[row].length; col++) {
				System.out.print(score[row][col] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("end");
	}
}
