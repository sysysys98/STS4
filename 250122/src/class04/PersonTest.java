package class04;

public class PersonTest {
	public static void main(String[] args) {
		//설계도를 이용하여 실제 객체를 생성해보자
		//Person을 일종의 자료형으로 만들어왔으니 new로 가져와보자
		
		Person p = new Person();
		p.study(10);
		p.study(10.0);
	}
}