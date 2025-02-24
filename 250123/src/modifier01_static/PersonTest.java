package modifier01_static;

public class PersonTest {
	public static void main(String[] args) {
		System.out.println("시작");
		Person p = new Person();
		System.out.println(p.pCnt);
		
		p.name = "yang";
		
		System.out.println(p.name);
		System.out.println(p.pCnt++);
		
		Person p2 = new Person();
		System.out.println(Person.pCnt);
		
		p.eat();
		p.study();
		//둘 다 가능
		
		Person.eat(); // 가능
		//Person.study(); //불가
	}
	
	
}
