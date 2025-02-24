package abstractclass04;

public class ChefTest {
	public static void main(String[] args) {
		Chef[] chefs = new Chef[2];
		
		chefs[0] = new KFoodChef();
		chefs[0].cook();
		
		//추상클래스 => 미완성의 설계도 -> 인스턴스를 생성할 수 없다고 했다
		//미완성인 부분을 만들어주면 되는 거 아님?
		//=>익명 클래스 문법을 이용하여 1회 한정으로 구현하면 인스턴스 생성 가능(잘 사용하진 X)
		
		chefs[1] = new Chef() {
			@Override
			public void cook() {
				System.out.println("랜덤 요리를 한다.");
			}			
		};

		chefs[1].cook(); //이게 되네
		
	}
}
