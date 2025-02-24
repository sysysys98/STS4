import java.util.Arrays;

public class Array05_이진검색 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 9, 11, 19, 23}; //정렬O
		int key = 10; //보통은 입력으로 주어진다 sc.nextInt();
		int N = arr.length;
		
		System.out.println(binarySearch(arr, key, N));
		System.out.println(Arrays.binarySearch(arr, 10));
		
	}
	
	static int binarySearch(int[] arr, int key, int N) {
		int l = 0; //시작점
		int r = arr.length-1; //끝점
		
		
		while(l<=r) { //같을때까진 돌리고 교차되면 멈춘다
			int mid = (l+r)/2; //int니까 알아서 버림 처리가 되겟죵
			if(arr[mid] == key) { //찾았당
				return mid;
			} else if (arr[mid] < key) { //가운데가 작아->오른쪽 구간으로 가자
				l = mid + 1; //어차피 r은 끝에있자나				
			} else {
				r = mid - 1; //그게 아니면 앞을 뒤지러 간다
			}			
		}
		return -1;		
	}	
}
