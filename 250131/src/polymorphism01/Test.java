package polymorphism01;

public class Test {
	public static void main(String[] args) {
		Student st = new Student(); //가능
		Person p = new Student(); //가능함, 학생은 사람이니까
		Object obj  = new Student(); //이것도 가능함 학생은 객체니까
		
//		Student st2 = new Person(); 이건 안 됨
		
		st.eat();
		p.eat(); //참조 타입은 Person이지만 Student에서 eat이라는 메서드를 재정의했음
		//힙 메모리에는 Student가 올라가 있다는 거임
		//따라서 Student eat()메서드가 동작하게 됨. -> 동적 바인딩
		//메서드에 한해서임. 필드는 참조를 반영함 ?? 이거 헷갈리네
	}
}
