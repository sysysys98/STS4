package interface05_다형성;

public class Test {
	public static void main(String[] args) {
		//참조 타입으로 Chef를 사용할 수 있음
		Chef chef = new KFoodChef(); //다형성
		
		chef.cook(); //동적 바인딩=>KFoodChef의 cook이 나온다
	}
}
