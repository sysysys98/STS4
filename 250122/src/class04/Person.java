package class04;

public class Person {
	String name;
	int age;
	String hobby;	
	
	void info() {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s%n", name, age, hobby);
	}
	
	void study(int time) {
		System.out.println(time+"시간 공부햇습니다");
	}
	
	void study(long time) {
		System.out.println(time+"시간 공부햇습니다");
	}
	
	void study(double time) {
		System.out.println(time+"시간 공부햇습니다");
	}
}
