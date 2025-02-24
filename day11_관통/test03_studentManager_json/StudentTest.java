package test03_studentManager_json;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager sm = StudentManager.getManager();

		int sel;
		do {
			System.out.println("-------------------------------------");
			System.out.println("학생 관리 프로그램 (번호입력)");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체조회");
			System.out.println("3. 학생 검색(이름)");
			System.out.println("4. 전공변경");
			System.out.println("5. 학생 삭제");
			System.out.println("6. 저장");
			System.out.println("0. 종료");
			sel = sc.nextInt();
			////////////////////////////////////////////////////////
			// 1. if - else if - else
			if (sel == 1) {
				System.out.println("학생 추가하겠습니다.");
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				System.out.println("전공 : ");
				String major = sc.next();
				sm.addStudent(new Student(name, age, major));
			} else if (sel == 2) {
				for (Student st : sm.getAllStudent()) {
					System.out.println(st);
				}
			} else if (sel == 3) {
				System.out.println("학생 이름으로 검색한다 (이름 입력)");
				String name = sc.next();
				Student st = sm.searchByName(name);
				if (st == null) {
					System.out.println("그런 학생은 없습니다.");
				} else {
					System.out.println("조회한 학생은 다음과 같습니다.");
					System.out.println(st);
				}

			} else if (sel == 4) { // 전공 변경
				System.out.println("전공을 변경합니다.");
				System.out.println("이름: ");
				String name = sc.next();
				System.out.println("전공: ");
				String major = sc.next();
				try {
					sm.changeMajor(name, major);
				} catch (StudentNotFoundException e) {
					System.out.println(e.getName() + "없어 ㅠ");
				}
			} else if (sel == 5) {
				System.out.println("학생이 취업했습니다.");
				System.out.println("이름: ");
				String name = sc.next();
				if (sm.removeStudent(name)) {
					System.out.println("취업 축하드립니다.");
				} else {
					System.out.println("우리 학생이 아닙니다.");
				}
			} else if(sel == 6) {
				sm.saveData();
			}
			// 2. switch

		} while (sel != 0);

		sc.close();

	}
}
