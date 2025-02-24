
public class Array10_델타 {
	//델타는 static으로 선언 마니 함
	public static void main(String[] args) {
		//상하좌우
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		int[][] arr = new int[3][3];
		
		//현재 정중앙
		int N = arr.length;
		int r=1;
		int c=1;
		
		for(int d=0; d<4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			//좌표값 할당까지는 문제 안 됨 불러오려고하면 에러남
			//2가지 방식으로 처리
			//1. 내 범위 안에 들어오면 할래
			if(nr >= 0 && nr<N && nc>=0 && nc<N) {
				System.out.println(arr[nr][nc]);
			}
			//2. 내 밖이야 그럼 안 해
			if(nr<0 || nr>=N || nc<0 || nc>=N) continue;
			System.out.println(arr[nr][nc]);
		}
	}
}
