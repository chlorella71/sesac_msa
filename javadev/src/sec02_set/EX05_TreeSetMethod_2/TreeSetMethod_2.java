package sec02_set.EX05_TreeSetMethod_2;

import java.util.TreeSet;

class MyClass {
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}
class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	//크기비교의 기준설정(음수, 0, 양수)
	@Override
	public int compareTo(MyComparableClass o) {
		if(this.data1 < o.data1) return -1;
		else if(this.data1 == o.data1) return 0;
		else return 1;
	}
}

public class TreeSetMethod_2 {
	public static void main(String[] args) {
		//1. Integer크기비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		System.out.println(treeSet1.toString());
		
		//2. String 크기비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = "가나";
		S
	}

}
