import java.util.Arrays;

public class Array06_선택정렬 {
	public static void main(String[] args) {
		int[] arr = {3, 13, 26, 88, 22, 11, 54, 12};
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			//가장 작다고 믿는 수로 초기화
			int minIdx = i;
			//나를 제외하고/정렬된 곳도 제외하고 나머지 중 가장 작은 값의 위치를 찾는다.
			for(int j= i+1; j<arr.length; j++) {
				if(arr[minIdx] > arr[j]) { //작다고 믿은 값이 더 커버리면
					minIdx = j; //j가 젤 작다고 갱신해줌
				}
			}
			//swap 할거양
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
	}
}
