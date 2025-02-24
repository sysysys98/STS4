import java.util.Scanner;
import java.util.Stack;

public class Stack05_뒤로앞으로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//스택 2개
		Stack<String> 뒤로 = new Stack<>();
		Stack<String> 앞으로 = new Stack<>();
		
		//학생관리 -> do while
		
		String page = "구글";
		while(true) {
			System.out.println("1. 새로운 페이지 방문(주소나 파비콘 클릭)");
			System.out.println("2. 뒤로 ㄱㄱ");
			System.out.println("3. 앞으로 ㄱㄱ");
			System.out.println("0. 종료(1,2,3말고 딴거 뭐든 입력하든 종료해주기");
			
			//선택 메뉴
			int N = sc.nextInt();
			
			switch (N) {
			case 1: 
				//새 페이지 ㄱㄱ
				//1. 현재 페이지를 뒤로 스택에 넣는다.
				뒤로.push(page);
				//2. 새로운 페이지를 입력받자
				page = sc.next(); //페이지명에 공백 없다고 가정
				//3. 앞으로 스택을 비워야 함(새 페이지 가면 앞으로는 필요없음)
				//3-1. 반복문으로 앞으로스택을 비울때까지 뽑거나
				//3-2. 아예 새 스택으로 만들어버림(new 인스턴스 생성)
				//3-3. clear() 메서드 활용해서 비워
				앞으로.clear();
				//4. 현재페이지를 출력해줄수도 있겠지(선택)
				System.out.println("현재 페이지: "+page);
				
				break;
			case 2: //뒤로 ㄱㄱ
				if(뒤로.isEmpty()) {
					System.out.println("비어있으니까 뒤로가기못해");
					//아예 뒤로 버튼 비활성화 시켜놓는게 나음
				} else {
					//1. 현재 페이지를 앞으로 스택에 넣는다.
					앞으로.push(page);
					//2. 뒤로에 있는 페이지를 꺼내서 현재 페이지로 변경
					page = 뒤로.pop();
					//3. 출력(선택)
					System.out.println("현재 페이지: "+page);
				}
				
				break;
			case 3: //앞으로
				if(앞으로.isEmpty()) {
					System.out.println("내가 최신, 더 앞으로 갈 곳 없음");
					//아예 앞으로 버튼 비활성화 시켜놓는게 나음
				} else {
					//1. 현재 페이지를 뒤로 스택에 넣는다.
					뒤로.push(page);
					//2. 앞으로에 있는 페이지를 꺼내서 현재 페이지로 변경
					page = 앞으로.pop();
					//3. 출력(선택)
					System.out.println("현재 페이지: "+page);
				}
				break;
				
			default:
				System.out.println("빠이용");
				return;
			}
			
		}
		
		
		
		
		
	}
}
