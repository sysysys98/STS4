package class03;

public class PersonTest {
	public static void main(String[] args) {
		//설계도를 이용하여 실제 객체를 생성해보자
		//Person을 일종의 자료형으로 만들어왔으니 new로 가져와보자
		
		Person yang = new Person();
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		yang.info();
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		hong.info();
	}
}