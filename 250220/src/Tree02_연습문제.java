import java.util.Arrays;
import java.util.Scanner;

public class Tree02_연습문제 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(input); <<=이런식으로 
		
		
		int v = sc.nextInt(); //노드 총 개수 (1번부터 시작하는 경우 가정)
		int[][] tree = new int[v+1][3];// [0]왼자 [1]오자 [2]부모
		
		for(int i=0; i<v-1; i+=2) {
			int p = sc.nextInt(); //부모
			int c = sc.nextInt(); //자식
			//문제에서 부모의 노드 번호가 작은 것부터 준다...
			//왼쪽 자식부터 준다 
			if(tree[p][0] == 0) { //왼자 아직 안 채웠으면
				tree[p][0] = c; //왼자에 넣고
			} else {
				tree[p][1] = c; //오자 저장
			}
			
			//부모를 저장하자
			tree[c][2] = p;
		}//입력처리
		
		for(int i=0; i<v+1; i++) {
			System.out.println(i+" : "+Arrays.toString(tree[i]));
		}
		
	}
	
	static String input = "13 \r\n" + "sdfasdasdfjkla;sdf";
}
