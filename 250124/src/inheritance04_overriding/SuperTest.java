package inheritance04_overriding;

class Parent {
	String name1 = "부모님 이름";
	
	void eat() {
		System.out.println("냠냠");
	}
}


public class SuperTest {
	public static void main(String[] args) {
		Student st = new Student("a",10,"c");
		System.out.println(st);
	}
}
