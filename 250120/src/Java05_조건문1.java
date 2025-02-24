
public class Java05_조건문1 {
	public static void main(String[] args) {
		int age = 10;
		
		if (age >= 10) {
			System.out.println("10살 이상입니다.");
		}
		// 블록하고 ctrl+Alt+아래 방향키 하면 복사됨
		if (age >= 10) {
			System.out.println("10살 이상입니다.");
		}
		
		// 20살 이상이면 주류 허용
		// 아니면 음료만
		if (age >= 20) {
			System.out.println("주류 OK");
		} else {
			System.out.println("음료만");
		}
		
		//중첩 조건문
		//90점 이상 A / 80점 이상 90점 미만 B / 70점 이상 80점 미만 C / 그 외 F
		int score = 75;
		if (score >= 90) {
			System.out.println("A");
		} else {
			// 90점 미만
			if (score > 80) { // score < 90 && score >= 80 이라고 써도 되지만 굳이?
				System.out.println("B");
			} else {
				if (score >= 70) {
					System.out.println("C");
				} else {
					System.out.println("F");
				}
			}
		}
		//영역 블록하고 ctrl+shift+F 자동정렬 단축키
	}
}
