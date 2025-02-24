package test03_studentManager_json;

public class Student {
	// 필드생성 -> 고유하게 식별할 수 있는 식별자가 있으면 좋아
	private String name; //예시로 동명이인은 없다고 가정함으로써 얘가 고유해
	private int age;
	private String major;

	// 생성자 생성
	public Student() {
//		super();
	}

	public Student(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}

	// 접근자와 설정자
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

	//출력을 위한 메서드
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + "]";
	}

}
