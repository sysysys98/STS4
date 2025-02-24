package test02_try_catch;

public class ExceptionTest02 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		 
		// 예외가 발생할 수 있는 코드
		//try-catch 구문으로 처리해보자
		try {
			System.out.println("정상1");
			System.out.println(nums[2]);
			System.out.println("정상2");
//		} catch (ArithmeticException e) { //이걸론 처리 불가함
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("이슈발생");
		}
		System.out.println("프로그램 종료");
	}
}
