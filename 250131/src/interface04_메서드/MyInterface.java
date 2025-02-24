package interface04_메서드;

public interface MyInterface {
	default void method3() {
		System.out.println("디폴트 메소드 입니당");
	}
	
	default void method4() {
		System.out.println("메서드4");
	}
	
	static void method5() {
		System.out.println("static 메서드");
	}
}
