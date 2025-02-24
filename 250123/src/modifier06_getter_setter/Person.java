package modifier06_getter_setter;

public class Person {
	private String name;
	private int age;
	private String hobby;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	//설정사 생성: 현재 객체의 멤버변수 값을 바꿈
	public void setName(String name) {
		this.name = name;
	}
	
	//접근자 생성: 현재 객체의 멤버변수 값을 가져옴
	public String getName() {
		return name; //굳이 this 안 붙여도 됨
	}
	
	public void setAge(int age) {
		if(age<0) {
			System.out.println("나이 음수 안됨");
			return;
		} else if (age>= 130) {
			System.out.println("당신은 로봇 입니까?");
			return;
		}
		this.age = age;
	}
	public void info() {
		System.out.println(name+"입니다.");
	}

}
