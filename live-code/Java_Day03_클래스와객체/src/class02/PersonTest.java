package class02;

public class PersonTest {
	public static void main(String[] args) {
		//설계도를 이용하여 실제 객체를 생성해보자.
		//new 키워드 필요해!
		
		Person yang = new Person();
		yang.name="Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
//		System.out.println("나의 이름은 "+yang.name+"입니다.");
//		System.out.println("나이는 "+yang.age+"세, 취미는 "+yang.hobby);
		
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		
//		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s%n",hong.name, hong.age, hong.hobby);
		
		info(yang.name, yang.age, yang.hobby);
		info(hong.name, hong.age, hong.hobby);
		
//		new PersonTest().info2(hong.name, hong.age, hong.hobby);
		
		
		
	}
	
	public static void info(String name, int age, String hobby) {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s%n",name, age, hobby);
	}
	
	public void info2(String name, int age, String hobby) {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s%n",name, age, hobby);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
