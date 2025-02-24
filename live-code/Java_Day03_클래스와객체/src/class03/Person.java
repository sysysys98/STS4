package class03;

public class Person {
	String name;
	int age;
	String hobby;
	
	
	void info() {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s%n",name, age, hobby);
	}
	
	//메서드 오버로딩
	void study(int time) {
		//int time = ?
		System.out.println(time+"시간 공부를 했습니다.");
	}
	
//	void study(int age) {
//		//int time = ?
//		System.out.println(age);
//	}
	
	
//	int study(int time) {
//		//int time = ?
//		System.out.println(time+"시간 공부를 했습니다.");
//		return time;
//	}
//	
//	void study(long time) {
//		System.out.println(time+"시간 공부를 했습니다.");
//	}
	
//	void study(double time) {
//		System.out.println(time+"시간 공부를 했습니다.");
//	}
	
	
	void study(String subject, int time) {
		
	}
	void study(int time, String subject) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
