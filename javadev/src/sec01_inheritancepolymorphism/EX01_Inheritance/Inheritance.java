package sec01_inheritancepolymorphism.EX01_Inheritance;


class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{	//human 클래스 상속
	int studentID;
	void goToSchool() {}
}
class Worker extends Human{	//human 클래스 상속
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		//Human 객체생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;	//추가로 정의한 멤버
		s.eat();
		s.sleep();
		s.goToSchool(); //추가로 정의한 멤버
		
		//Worker 객체 생성
		Worker w = new Worker();	//추가로 정의한 멤버
		w.name = "봉윤정";
		w.age= 45;
		w.workerID = 128;	//추가로 정의한 멤버
		w.eat();
		w.goToWork();	//추가로 정의한 멤버
	}
}
