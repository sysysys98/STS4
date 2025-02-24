package abstractclass02;

public class ChefTest {
	public static void main(String[] args) {
		Chef[] chefs = new Chef[2];
		
		chefs[0] = new KFoodChef();
		chefs[1] = new JFoodChef();
		
		//Chef의 cook()을 삭제 후 override도 지운 경우
//		for(Chef chef : chefs) {
//			chef.eat();
////			chef.cook(); //여기서 문법 오류
//		}
		
		for(Chef chef : chefs) {
			if(chef instanceof KFoodChef) {
				KFoodChef k = (KFoodChef) chef;
				k.cook();
			} else if (chef instanceof JFoodChef) {
//				(JFoodChef) chef.cook(); //이건 연산자 우선순위땜에 chef.을 먼저 참조하려해서 오류남
				((JFoodChef) chef).cook(); //그래서 이렇게 먼저 묶어서 형변환하고 불러오게 하면 됨 ㅋ
			}
		}
		
	}
}
