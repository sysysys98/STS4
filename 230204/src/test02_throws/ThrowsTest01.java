package test02_throws;

public class ThrowsTest01 {
	public static void main(String[] args) {
		try{
			method1();		
		} catch (Exception e) {
			System.out.println("이슈발생");
		}
		System.out.println("이건 하니?");
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		//unChecked 계열 익셉션 발생 시도
		//2가지 선택
		// 1. 직접 처리(트라이캐치)
		// 2. 던짐(throws)
		//java는 0으로 나누는 걸 허용하지 x
		int i = 1 / 0;
	}
}
