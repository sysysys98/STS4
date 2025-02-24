import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class String01_생성 {
	public static void main(String[] args) {
		//1. 리터럴 사용 -> String Pool
		String str1 = "Hello";
		String str2 = "Hello";
		//str1, str2는 같은가? => 넵(똑같은 놈을 가리켜요)
		//그래서 아래처럼 참조자료형끼리의 ==비교(주소값비교)를 하면
		System.out.println(str1==str2); //true가 나옴
		
		//2. 힙에 생성
		String str3 = new String("Hello");
		//str1 str3는 달라용
		System.out.println(str1 == str3); //false
		//그러니 내용이 진짜 같은가를 보려면 equals를 쓰는 거임
		System.out.println(str1.equals(str3)); //true
		
		//아래 같은 것도 있다
		byte[] bytes = {65, 66, 67};
		String str4 = new String(bytes, StandardCharsets.UTF_8);
		//byte 배열을 문자열로 바꾸되 UTF-8방식을 적용하겟당
		System.out.println(str4); //ABC
		
		//문자열은 불변성을 가짐
		//문자열에서 문자를 하나씩 뜯어오고 싶다면?
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));			
		}
		
		//문자열을 char[] 형태로 만들려면
		char[] arr1 = new char[str1.length()];
		for(int i=0; i<str1.length(); i++) {
			arr1[i] = str1.charAt(i);			
		}
		System.out.println(Arrays.toString(arr1));
		
		//더 날로 먹는 방법은 없나
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		for(char c : str1.toCharArray()) { //for each 쓰려면
			System.out.println(c);
		}
		
		//java에서 문자 한 개를 입력 받는 방법
		//문자열로 받아서 charAt(0)로 해야함
		//sc.next().charAt(0) 이런 식으로 문자 한개씩 받을 수 있다
		
		//문자열 안에 해당 인자를 포함하고 있는지 확인
		str1.contains("ll"); //true

		//split: 구분자로 문자열 배열 반환
		String[] arrays = "문,자,열".split(",");
		System.out.println(Arrays.toString(arrays));
		String[] arrays2 = "문,자,열".split("");
		System.out.println(Arrays.toString(arrays2));
		
		
		
		
		
	}
}
