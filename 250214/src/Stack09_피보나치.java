import java.util.Arrays;

public class Stack09_피보나치 {
	static int[] cnt = new int[100];
	public static void main(String[] args) {
		System.out.println(fibo2(20));
		System.out.println(Arrays.toString(cnt));
	}
	
	//나의 이전+나의 이이전을 더해서 만듭니다요
	public static int fibo(int n) {
		cnt[n]++;
		if(n < 2) return n;
		
		return fibo(n-1)+fibo(n-2);
	}
	
	//중복호출을 없애 보자
	static int[] memo = new int[50];
	static {
		for(int i=0; i<memo.length; i++) {
			memo[i] = -1;
		}
//		Arrays.fill(memo,  -1); 이렇게도 가능
		//근데 이 메서드 자체가 반복문으로 만들어진 거라 큰 차이는 없음
		memo[0] = 0;
		memo[1] = 1;
	}
	
	public static int fibo2(int n) {
		cnt[n]++;
		if(memo[n]==-1) { //-1로 채워놨을 경우
			memo[n] = fibo2(n-1)+fibo2(n-2);
		}
		//아래처럼
//		if(n >= 2 && memo[n]==0) {
//			memo[n] = fibo2(n-1)+fibo2(n-2);
//		}
		return memo[n];
	}
}
