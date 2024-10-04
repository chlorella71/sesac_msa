package control.loop;

public class Gugu {
	public static void main(String[] args) {
		for(int k = 1; k<=5; k+=4) {
			for(int i =1; i<=9; i++) {
				for (int j =k+1; j<=k+4; j++) {
					System.out.print(j + "*" + i +"=" + i*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("end");
	}
}

/*k = 1; k<=2 k++
 * i = 1; i<=9; i++
 * j = 2; j<=9; j++
 *	k= 1 j = 2, 3, 4, 5 j <= 4 j++
 *  k= 2 j = 6, 7, 8, 9
 *  2 = 1x
 *  6 = 2x  3
 * 
 * 
 * 
 * 
 */

/*
 * 강사님 풀이
 *1. 2단과 6단을 만듬
 *2. 2단과 6단이 1씩 증가해서 4번 반복되도록 짜기(열복제)
 *#한번 처리후 열복제, 행복제 개념을 생각해두면, 데이터가 많을때 활용하기 좋
 *
 *직관으로 한번에 풀면 컨디션에 좌우됨
 *하나씩 풀어서 짜는게 좋음
 *
 *사소한 코드라도 짜게되면 인터넷에 공유해서 피드백받으면서 계속 수정
 *그러다보면 범위가 넓어
 *
 *public class Gugu {
 *	public static void main(String[] args) {
 * 		for(int i=2; i <= 9; i+=4) {
 * 			for (int j=1; j<=9; j++) {
 * 				for (int k=i; k<=i+3; k++) {
 * 					System.out.printf("%2d*%2d=%2d\t", k,j,k*j);
 * 				}
 * 				System.out.println();
 * 			}
 *			System.out.println();	
 *		}	
 *	}
 *}
 *
 *
*/
