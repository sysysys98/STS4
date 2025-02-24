
public class Java04_Operator {
	public static void main(String[] args) {
		// 산술 연산자: 수학적 연산
		int a = 20;
		int b = 10;
		
		System.out.println(a/b); // 정수/정수는 정수가 답으로 출력
		
		double b2 = 10;
		
		System.out.println(a/b2);
		// 그러나 이렇게 정수와 실수가 연산이 된다면 결과는 실수가 출력된다.
		
		
		// 비교 연산자: 참 거짓 결과 반환
		// 문자열 비교는 equals()를 이용하자
		int c = 100;
		int d = 1000;
		System.out.println(c == d);
		System.out.println(c != d);
		
		String e = "Java";
		String f = "Python";
		String g = "Java";
		
		System.out.println(e == f);
		System.out.println(e == g);
		System.out.println(e.equals(f));
		System.out.println(e.equals(g));
	}
}
