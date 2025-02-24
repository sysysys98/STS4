package test03_studentManager_json;

public class Student {
	//필드 생성
	private String name;
	private int age;
	private String major;
	//동명이인 없다고 가정해서 id(고유값)는 만들지 않음
	
	//생성자
	public Student() {}

	public Student(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + "]";
	}
	
	
}
