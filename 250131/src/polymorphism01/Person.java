package polymorphism01;

public class Person {
	String name;
	int age;
	
	public Person() {
		//super(); //상위클래스(object)의 기본 생성자 호출이 생략되어 있음
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	@Override
	public String toString() {
		return "Person 어쩌구";
	}
}
