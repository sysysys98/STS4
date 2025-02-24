package test01_studentManager;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentManager sm = StudentManager.getManager();
		
		int sel;
		
		do { //무조건 한 번은 받고 나중에 조건을 확인
			System.out.println("학생 관리 프로그램 (번호 입력)");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 이름 검색");
			System.out.println("4. 학생 전공 변경");
			System.out.println("5. 학생 삭제");
			System.out.println("0. 종료");
			sel = sc.nextInt(); 
			
			/////////////////////////
			//if나 switch 방식을 쓸 수 있겠지~
			
			if (sel==1) {
				System.out.println("학생 추가");
				System.out.println("이름: ");
				String name = sc.next();
				System.out.println("나이: ");
				int age = sc.nextInt();
				System.out.println("전공: ");
				String major = sc.next();
				sm.addStudent(new Student(name,age,major));
				
			} else if (sel==2) {
				for(Student st : sm.getAllStudent()) {
					System.out.println(st);
				}
			} else if (sel==3) {
				System.out.println("학생을 이름으로 검색 (이름 입력)");
				String name = sc.next();
				Student st = sm.searchByName(name);
				if(st==null) {
					System.out.println("없는데용?");
				} else {
					System.out.println("조회한 학생은 다음과 같습니다.");
					System.out.println(st);
				}
			} else if (sel==4) {
				System.out.println("전공 변경할 학생 이름으로 검색 (이름 입력)");
				String name = sc.next();
				System.out.println("변경할 전공 이름 입력");
				String major = sc.next();
				boolean changed = sm.changeMajor(name, major);
				if (changed) {
					System.out.println("변경 완료");
				} else {
					System.out.println("실패");
				}				
			} else if (sel==5) {
				System.out.println("삭제할 학생 이름 입력");
				String name = sc.next();
				boolean deleted = sm.removeStudent(name);
				if (deleted) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("실패");
				}	
			}
			//0은 어차피 while문에서 한번 따지기 때문에 굳이 안 만들어도 ㅇㅋ
		}while(sel !=0);
		
		
		
		
		
		sc.close();
		
	}
}
