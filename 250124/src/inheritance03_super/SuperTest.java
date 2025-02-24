package inheritance03_super;

class Parent {
	String name1 = "부모님 이름";
	
	void eat() {
		System.out.println("냠냠");
	}
}

class Child extends Parent {
	String name2 = "자식 이름";
	
	void printName() {
		System.out.println(name1);
		System.out.println(name2);
	}
	
	void eat() {
		super.eat();
		System.out.println("쩝쩝");
	}
}


public class SuperTest {
	public static void main(String[] args) {
		Child child = new Child();
		child.eat();
	}
}
