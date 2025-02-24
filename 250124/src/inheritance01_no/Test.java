package inheritance01_no;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		
		Student st = new Student();
		
		//아래 eat()들은 이름만 같지 서로 연관이 없음(서로 다른 클래스에서 정의)
		p.eat();		
		st.eat();
	}
}
