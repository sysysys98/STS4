package interface04_메서드;

public class MyClass implements MyInterface, MyInterface2 {

	@Override
	public void method3() {
		System.out.println("충돌남");
	}
	
	@Override
	public void method4() {
		System.out.println("클래스에서 재정의한 메서드");
	}
	
	public void method6() {
		System.out.println("클래스의 메서드입니다");
	}
	
}
