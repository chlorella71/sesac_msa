package sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리연산자
		//@AND(&&)
		System.out.println(true && true);
		System.out.println(true&&false);
		System.out.println(true&&(5<3));
		System.out.println((5<=5)&&(7>2));
		System.out.println();
		
		//@OR(||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || (5 < 3));
		System.out.println((5 <= 5) || (7 >2) );
		System.out.println();
		
		//@XOR(^)
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^(5<3));
		System.out.println((5<=5)^(7>2));
		System.out.println();
		
		//@NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3));
		System.out.println((5<=5 || !(7>2)));
		System.out.println();
		
		//비트연산자로 논리연산수행
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true | (5<3));
		System.out.println((5<=5 | (7>2)));
		System.out.println();
		
		//@쇼트서킷사용여부(논리연산자는O, 비트연산자X)
		int value1 =3;
		System.out.println(false&&++value1>6);
		System.out.println(value1);
		System.out.println();
		
		int value2 = 3;
		System.out.println(false&++value2>6);
		System.out.println(value2);
		System.out.println();
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		System.out.println();
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
		
		
	}
}
