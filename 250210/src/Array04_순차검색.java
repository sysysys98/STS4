
public class Array04_순차검색 {
	public static void main(String[] args) {
		int[] arr = {4, 9, 11, 23, 2, 19, 7}; //정렬X 상태
		int[] arr2 = {4, 9, 11, 23, 24, 50, 99}; //정렬O 상태
		int key = 2; //보통은 입력으로 주어진다 sc.nextInt();
		int N = arr.length;
		
		System.out.println(searchWhileNoSort(arr, key, N));
		
	}
	
	static int searchForNoSort(int[] arr, int key, int N) {
		//마음의 과제
		
		return 1;
		
	}
	
	
	static int searchWhileNoSort(int[] arr, int key, int N) {
		int i=0;
		
		while(i<N && arr[i] != key) {
			i++;
		}
		
		if(i<N) return i; //배열 다 돌기 전에 나왔으면 찾은 거니까 i 반환
		return -1; //아님 실패했으니 -1 반환
		
//		while(i<N) { 위에 있는 거나 이거나 똑같은 거임
//			if(arr[i] == key) {
//				return i;
//			}
//			i++;
//		}		
//		if(i<N) return i;
//		return -1;
	}
	
	static int searchForSort(int[] arr, int key, int N) {
		for(int i=0; i<N; i++) {
			if(arr[i] == key) return i; //확인 값이 찾으려는 값보다 크면
			else if (arr[i] > key) break; //뒤를 볼 필요도 없다 나가라
		}
		return -1;
	}
	
	static int searchWhileSort(int[] arr, int key, int N) {
		
		return -1;
	}
	
}
