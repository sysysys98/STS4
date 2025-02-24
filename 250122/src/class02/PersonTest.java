package class02;

public class PersonTest {
	public static void main(String[] args) {
		//설계도를 이용하여 실제 객체를 생성해보자
		//Person을 일종의 자료형으로 만들어왔으니 new로 가져와보자
		
		Person yang = new Person();
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		System.out.println("나의 이름은 "+yang.name+"입니다.");
		System.out.println("나이는 "+yang.age+"세, 취미는 "+yang.hobby);
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		
		info(yang.name, yang.age, yang.hobby);
		
	}
	
	public static void info(String name, int age, String hobby) {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s%n", name, age, hobby);
	}
}