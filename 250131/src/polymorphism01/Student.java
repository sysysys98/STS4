package polymorphism01;

public class Student extends Person{
	
	String major;
	
	public Student() {
		
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("지식 냠냠");
	}
	
	public void study() {
		System.out.println("공부");
	}

	@Override
	public String toString() {
		return "Student [major=" + major + "]";
	}
	
	

}
