package inheritance04_overriding;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public void eat() {
		System.out.println("냠냠");
		
	}
}
