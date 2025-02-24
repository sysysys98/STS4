import java.util.Arrays;

public class Array06_2차원배열 {
	public static void main(String[] args) {
		
		
		//선언
		int[][] arr1; //권장
		int[] arr2[]; //하지마
		int arr3[][]; //비추
		
		int[][] arr4 = new int[2][3]; //행2, 열3
		System.out.println(arr4[0]); //주소가 출력된다
		System.out.println(arr4[0][0]); // 값이 나온다
		
		//2차원 배열 출력
		for(int i=0; i<arr4.length; i++) {
			System.out.println(Arrays.toString(arr4[i]));
		}
		
		//한줄 출력
		System.out.println(Arrays.deepToString(arr4)); //[[0, 0, 0], [0, 0, 0]]
		
		int[][] arr5 = new int[3][]; //비정형 {null, null, null}
		arr5[0] = new int[] {1,2,3};
		arr5[1] = new int[] {5,6,7,8,9};
		arr5[2] = new int[] {1};
		//아무튼 비정형 2차원 배열이므로 1차원 배열을 요소로 갖기만 하면 된다.
		System.out.println(Arrays.deepToString(arr5));
		//[[1, 2, 3], [5, 6, 7, 8, 9], [1]]
		
		
	}
}
