
public class Stack08_팩토리얼 {
	public static void main(String[] args) {
		System.out.println(fac(5));
		System.out.println(fac(13));//int형으로 처리 불가해서 잘못된 값이 나옴
	
		//이렇게 간단한 건 반복문으로도 금방 쓸 수 있긴 함...
	}
	
	public static int fac(int n) {
		if(n==0 || n==1) { //기본(조건)
			return 1;
		}
		return n*fac(n-1); //재귀
	}
}
