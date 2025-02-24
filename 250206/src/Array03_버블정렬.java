import java.util.Arrays;

public class Array03_버블정렬 {
	public static void main(String[] args) {
		
		int[] arr = {55, 7, 78, 12, 42};
		
		arr = bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] bubbleSort(int[] arr) {
		int N = arr.length;
		
		//버블정렬(오름차순)
		//i: 각 사이클에서 최대 데이터가 정렬될 위치
		for (int i=N-1; i>0; i--) {
			//j: 인접 위치와 비교할 친구
			for (int j=0; j<i; j++) {
				if( arr[j] > arr[j+1] ) { //앞의 것이 더 크다면
					//교환
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		return arr;
	}
}
