package inheritance05_final;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	//여기서 final을 붙이면 자식에서 오버라이딩 불가
	public final void eat() {
		System.out.println("냠냠");
		
	}
}
