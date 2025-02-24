package polymorphism01;

public class Test2 {
	public static void main(String[] args) {
		//형 변환
		//묵시적(자동) 형변환
		
		Student st = new Student();
		Person p = st;
		Object obj = st; //더 큰 개념에다가 작은 걸 넣을 수는 있음
		obj = p; //이것도 가능
		//이런 게 자동 형변환임
		
		//명시적 형변환 -> 직접 변환해줘야 함 (조상 타입을 자손 타입으로 바꾸려 하면)
		//형 변환 생략이 불가하다
		
		Person p2 = new Person();
//		Student st2 = (Student) p2; //이건 안 되는 경우
//		System.out.println(st2);
		
		if (p2 instanceof Student) { //이렇게 instanceof를 써서 가능한 경우에만 캐스팅하게 만들면 오류안남
			Student st2 = (Student) p2;
			st2.study();
		}
		
		Person p3 = new Student();
		Student st3 = (Student) p3;
		st3.study();
		
		
	}

}
