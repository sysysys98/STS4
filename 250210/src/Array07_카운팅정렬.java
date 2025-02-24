import java.util.Arrays;

public class Array07_카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = {3, 13, 26, 88, 22, 11, 54, 12};
		
		countingSort(arr);
	}
	
	static void countingSort(int[] arr) {
		//1. 가장 큰 값을 찾음(문제에 따라서 배열에 음수가 나오는 경우 작은 값도 찾아야 함)
		//뭐 양수여도 미리 최소값이 주어진다면 배열을 더 작게 만들어서 메모리 효율화도 가능하겟징?
		
		int K = -1;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > K) K = arr[i];
		}
		
		//2. Count하기
		int[] count = new int[K+1];
		for (int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		//3. 누적합 구하기(해당 원소가 있을 위치를 찾기 위해)
		for (int i=1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		//4. 역방향으로 순회하며 값 넣기(안정정렬)
		int[] sortArr = new int[arr.length];
		for (int i= arr.length-1; i>=0; i--) {
//			int num = arr[i];
//			int idx = count[num]-1;
//			sortArr[idx] = num;
//			count[num]--;
			//위처럼 쓰거나 아래처럼 한줄로 해버릴 수도 있죵
			sortArr[--count[arr[i]]] = arr[i];
			
		}
		System.out.println(Arrays.toString(sortArr));
	}
}
