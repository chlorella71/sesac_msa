package method;

public class MethodTest1 {
	public static void main(String[] args) {
		//argument가 있는지/없는지
		//return값이 있는지/없는지(void)
		
		print();
		print("Java");
		print("Hello");
		
		int i = 10, j = 5;
		System.out.println(i + "+" + j +"=" +add(i, j));
		System.out.println(i + "-" + j +"=" +subs(i, j));
		System.out.println(i + "*" + j +"=" +mul(i, j));
		System.out.println(i + "/" + j +"=" +div(i, j)+"_"+mod(i,j));
		System.out.println();
		System.out.println("주사위  숫자는 " +dice());
		
		System.out.println("end");
		
		
	}

	private static int dice() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*6)+1;
	}

	private static int mod(int i, int j) {
		// TODO Auto-generated method stub
		int t =  i% j;
		return t;
	}

	private static int div(int i, int j) {
		// TODO Auto-generated method stub
		int t =  i/ j;
		return t;
	}

	private static int mul(int i, int j) {
		// TODO Auto-generated method stub
		int t =  i* j;
		return t;
	}

	private static int subs(int i, int j) {
		// TODO Auto-generated method stub
		int t =  i- j;
		return t;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		int t =  i+ j;
		return t;
	}

	private static void print(String string) {
		// TODO Auto-generated method stub
		System.out.println("----------");
		System.out.println(" "+string);
		System.out.println("----------");
		return;
		
	}

	private static void print() {
		// TODO Auto-generated method stub
		System.out.println("----------");
		System.out.println(" SESAC    ");
		System.out.println("----------");
		return;
		
	}
}
