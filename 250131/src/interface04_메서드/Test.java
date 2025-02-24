package interface04_메서드;

public class Test {
	public static void main(String[] args) {
//		MyInterface i = new MyInterface(); //불가. 인스턴스 생성 불가하니까
		MyClass c = new MyClass();
		
		c.method3();
		
		MyClass2 c2 = new MyClass2();
		
		MyInterface.method5();
		
		c2.method6();
	}
}
