
public class Array01_배열선언및생성 {
	public static void main(String[] args) {
		//배열 선언
		int[] arr1;
		int arr2[]; //비권장
		
		//생성 방법
		int[] arr3 = new int[10]; // -> {0,0,0,0, ... ,0}
		
		int[] arr4 = new int[] {1,2,3,4}; // 직접 값을 줘서 만들기도 한다.
		//대괄호 안에 숫자를 넣으면 안 된다.(설령 사이즈를 맞춰서 넣더라도...)
		
		int[] arr5 = {1,2,3,4}; // 이건 선언과 동시에 초기화 할 때만 가능한 방식
		
//		arr1 = {3,4,5,6}; // 이러면 오류남(재할당 불가)
		arr1 = new int[] {1,2,3,4}; //재할당 가능
		
		System.out.println(arr4[0]); //1
		
	}
}
