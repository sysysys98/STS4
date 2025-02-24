
public class Array08_2차원배열 {
	public static void main(String[] args) {
		//문제 풀 때는 입력을 받아서 채우겟지만~
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		//정방향으로 행 우선순회를 하겟다(오른쪽으로 찍 아랫줄 오른쪽으로 찍 ...)
		for(int i=0; i<arr.length; i++) {
			//열을 위한... 배열 길이가 다 같으면 arr[0].length 해도 ㅇㅋ
			for(int j=0; j<arr[i].length; j++) { 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//방향만 역방향으로 행 우선 순회(왼쪽으로 찍 아랫줄 왼쪽으로 찍 ...)
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) { 
				System.out.print(arr[i][arr[i].length-1-j]+" ");
			}
			System.out.println();
		}
		
		//정방향 열우선순회(열고정)
		for(int j=0; j<arr[0].length; j++) {
			for (int i=0; i<arr.length; i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//가변 길이 배열일 때 고민을 해보장
		
		
	}
}
