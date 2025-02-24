package polymorphism01;

class Parent {
	String x = "parent";
	
	public String method() {
		return "perent method";
	}
	
	public static String method2() {
		return "perent method";
	}
}

class Child extends Parent{
	String x = "child";
	
	public String method() {
		return "child method";
	}
	
	public static String method2() {
		return "child method";
	}
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.x); //child로 인스턴스 생성했어도 p를 참조하고 있기 때문에 parent 출력
		System.out.println(c.x);
		
		//동적바인딩 => 둘 다 child method가 출력된다
		System.out.println(p.method()); //메모리에는 child.method()가 올라가 있기 때문에
		System.out.println(c.method()); 
		
		//만일 static을 붙였다면?
		System.out.println(p.method2());
		System.out.println(c.method2());
		//각각 p.와 c.가 잘 출력된다
		//정적메서드(static)라서 동적바인딩에 해당 없음
	}
}
