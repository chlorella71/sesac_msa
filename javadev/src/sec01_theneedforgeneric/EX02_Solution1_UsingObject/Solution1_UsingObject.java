package sec01_theneedforgeneric.EX02_Solution1_UsingObject;

//Apple, Pencil 클래스를 모두 저장하거나 꺼낼수 있는 클래스

class Apple {}
class Pencil {}

class Goods {
	private Object object = new Object();
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
}

public class Solution1_UsingObject {
	public static void main(String[] args) {
		//Goods를 이용해 Apple객체를 추가하거나 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		System.out.println(apple);

		//Goods를이용해 Pencil객체를 추가하거나 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		System.out.println(pencil);
		
		//잘못된 캐스팅(약한 타입 체크)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil)goods3.getObject();	//실행예외발생
		
		Goods goods3 = new Goods();
		goods3.setObject(new Apple());
		if (goods3.getObject() instanceof Pencil) {
			Pencil pencil2 = (Pencil)goods3.getObject();
			System.out.println(pencil2);

		}else {
			Apple apple2 = (Apple)goods3.getObject();
			System.out.println(apple2);

		}
	}
}

