package inheritance05_final;

public class Student extends Person {
	String name;
	int age;
	String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	void study() {
		System.out.println("공부");
	}
	
	//메서드 오버라이딩 안됨
	public void eat() {
		System.out.println("지식을 먹는다.");
	}
	
	
	//이건 원래 메서드 오버로딩임
	//@Override //어노테이션 잘못 달면 밑부분에 빨간줄 나옴
	public void eat(int time) {
		System.out.println(time+"시간 공부");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + "]";
	}
	
	
}
