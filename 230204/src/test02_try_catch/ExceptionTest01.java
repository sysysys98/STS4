package test02_try_catch;

public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		 
		// 예외가 발생할 수 있는 코드
		//try-catch 구문으로 처리해보자
		try {
			System.out.println("정상1");
			System.out.println(nums[2]);
			System.out.println("정상2");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("이슈 발생");			
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("인덱스 이슈");
			} else {
				System.out.println("수학적 이슈");
			}
		}
		System.out.println("프로그램 종료");
	}
}
