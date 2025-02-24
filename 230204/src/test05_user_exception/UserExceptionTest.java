package test05_user_exception;

public class UserExceptionTest {
	
	public static String[] fruits = {"두리안", "귤"};
	public static void main(String[] args) {
		//과일 장사라는 시나리오가 있다고 하자
		//과일 목록
		try {
			sell("사과");
		} catch (FruitNotFoundException e) {
			System.out.println("이슈발생");
		}
		sell2("우엉");
	}
	
	public static void sell(String name) throws FruitNotFoundException {
		//내가 가진 과일 목록에서 name에 해당하는 과일 있음 팔고 없음 못 팔아
		for (int i=0; i<fruits.length; i++) {
			if (fruits[i].equals(name)) {
				System.out.println("이건 팔앗당");
				fruits[i] = null;
				return;
			}
		}
		//해당 라인 코드가 실행된다는 뜻은 위에서 못 판 거겟징?
		throw new FruitNotFoundException(name);
	}
	
	public static void sell2(String name) {
		throw new FruitNotFoundRuntimeException(name);
	}
}
