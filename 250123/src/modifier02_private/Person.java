package modifier02_private;

public class Person {
	private String name;
	private int age;
	
	private void info() {
		//내 클래스 내부에 있으니 나는 name
		//접근이 가능함
		name = "Yang";
	}
}
