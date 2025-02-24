package class06;

public class Dog {
	String name;
	int age;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
//	public Dog(int age) {
//		this.name = "우쭈쭈";
//		this.age = age;
//	}
	public Dog(int age) {
		this("우쭈쭈", age);
//		this.name = "바둑이";
	}
	
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
