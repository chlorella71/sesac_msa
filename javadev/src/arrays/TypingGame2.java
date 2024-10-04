package arrays;

import java.util.Scanner;

public class TypingGame2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] keywords = {
				"oop",
				"primitive type",
				"java",
				"james gosling",
				"for",
				"while",
				"do while",
				"continue",
				"break",
				"Scanner"
		};
		
		String[] keywords2 = {
				"oop",
				"primitive type",
				"java",
				"james gosling",
				"for",
				"while",
				"do while",
				"continue",
				"break",
				"Scanner"
		};
		
		
//		keywords2[0] = "aaa";
		System.out.printf("[0]: %s\n",keywords.hashCode());
		System.out.printf("[0]: %s\n",keywords2.hashCode());
		
		int[] item = new int[3];
//		for(int i =0; i < item.length; i++) {
//			item[i] = (int)(Math.random()*keywords.length);
//			//keywords[]의 길이만큼의 수에서 랜덤으로 수를 뽑아서 item[]에 넣음?
//			
//		}
		item[0] = (int)(Math.random()*keywords.length);
		do {
			item[1] = (int)(Math.random()*keywords.length);
			//keywords[]의 길이만큼의 수에서 랜덤으로 수를 뽑아서 item[]에 넣음?
			
		} while(item[0] == item[1]);
		do {
			item[1] = (int)(Math.random()*keywords.length);
			//keywords[]의 길이만큼의 수에서 랜덤으로 수를 뽑아서 item[]에 넣음?
			
		} while(item[2] == item[1] || item[2] == item[0]);
		
		
		int miss_count = 0; //오타횟수
		
		System.out.println("Game Start~!!!");
		long startTime = System.currentTimeMillis(); // System.currentTimeMillis(): 현재 시간 측정
		//	시작시간측정
		for(int i = 0; i < item.length; i++) {
			System.out.print(keywords[item[i]]+ " > ");
			String input = sc.nextLine(); // .nextLine(): 한줄로 입력받기
			if (!input.equals(keywords[item[i]])) { // .equals(): 참조자료형끼리의 값비교에 사용
				//input의 문자열과 keywords[item[i]의 문자열의 값을 비교해서 서로 같지 않다면 코드 실행
				System.out.println("typing miss");
				i--;
				miss_count++;
				//오타횟수 증가
			}
		}
		long endTime = System.currentTimeMillis(); //종료시간측정
		System.out.println("총 소요시간: "+ ((endTime - startTime)/1000) + "초");
		//System.currentTimeMillis()는 millisecond를 측정하기때문에 1000을 곱해줘서 초로 단위를 맞춤
		System.out.println("오타 횟수: " +miss_count);
		sc.close();
	}
}
