package test01_Exception;

public class Exception {
	public static void main(String[] args) {
		//1. Unchecked
		//런타임 계열
		int[] nums = {10};
		System.out.println(nums[2]); // <- 문법상으론 이상 없음(그래서 빨간줄x)
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1
//		at test01_Exception.Exception.main(Exception.java:8)
		
		//2.Checked
		//Exception 계열 / 컴파일 시점에서 이슈 발생, 대처 코드 없이는 진행x
		Class.forName("클래스이름은 풀패키지명으로 써주는 게 좋겠지");
		//위가 빨간줄이 되는 이유 = Unhandled exception type ClassNotFoundException
	}
}
