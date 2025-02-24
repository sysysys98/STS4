
public class Array09_달팽이순회 {
	//여러 가지 풀이 중에 하나일 뿐
	public static void main(String[] args) {
		int n = 4;
		int[][] arr = new int[n][n];
		
		int k = n; //k만큼의 길이를 이동하겟다!
		int dir = 1; //증감을 위한 변수 -> 1이었다가 -1이었다가~
		
		int r = 0; //행
		int c = -1; //열
		int num = 1;
		
		//num== n*n일때 끝내거나 k==0일때 멈추거나
		//중앙을 찍었을 때 (r,c) == (중앙좌표)일때 멈추거나 다양~
		while(true) {
			//수평 -> 수직 이동
			for(int i=0; i<k; i++) {
				c += dir; //열에다가 증감변수를 누적한다
				arr[r][c] = num++;
			}
			k--; //수평에서 수직으로 이동할 때 k가 감소하기로 했으니까
			if(k==0) break;
			//수직->수평 이동
			for(int i=0; i<k; i++) {
				r += dir;
				arr[r][c] = num++;
			}
			dir = -dir; //증감이 반대로
			}
		
		//출력해보장
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
