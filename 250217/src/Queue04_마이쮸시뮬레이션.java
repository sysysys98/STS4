import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue04_마이쮸시뮬레이션 {
	static class Person {
		int num; 
		int cnt;
		public Person(int num, int cnt) {
			super();
			this.num = num;
			this.cnt = cnt;
		}
		@Override
		public String toString() {
			return "Person [num=" + num + ", cnt=" + cnt + "]";
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t=1; t<=tc; t++) {
			int ans = 0;
			int n = sc.nextInt();
			int pNum = 1; //인간 번호는 1부터 시작이라고 tc마다 초기화해줌
			
			//몇번학생인지랑, 몇개가져가는건지
			//두 개가 자료형이 서로 같으니 배열로도 쓸 수 있다
			//Queue<int[]> 이렇게
			//int[0] = 번호 / int[1] = 개수
			//그러나 사용자 정의 클래스를 만들어 보자
			Queue<Person> q = new LinkedList<>(); 
			q.add(new Person(pNum++, 1));
			
			while(n > 0) { //다 나눠주면 멈춘다
				Person p = q.poll(); //한놈을 빼서 p로 지정
				n -= p.cnt; //cnt개 줬어~
				if(n <= 0) {
					ans = p.num;
					break; //뭐 이건 안 써도 됩니다 조건을 줫으니까
				} else { //아직 마이쮸가 있어
					//p가 재빠르게 다시 뒤로 가서 줄을 섦
					p.cnt++;
					q.add(p);
					//그 뒤에 다음 번호 사람이 와서 줄을 섦
					q.add(new Person(pNum++, 1));
				}				
			}//while
			
			//정답 출력
			System.out.println("#"+t+" "+ans);
			
		}//t
		
	}//main
}
