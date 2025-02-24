import java.util.Random;

public class FunctionTest {
	public static void main(String[] args) {
		System.out.println("기상");
		이동("교육장","버스");
		boolean 과제 = 교육();
		이동("집","헬기");
		if (과제) {
			System.out.println("과제 해");
		}		
		System.out.println("쿨");
	}

//	public static void 교육() { //void: 실행만 할 거고 반환은 필요 없어
//		System.out.println("오전 수업 듣는다");
//		System.out.println("점심");
//		System.out.println("오후 수업 듣는다");
//	}
//	
	public static boolean 교육() {
		System.out.println("오전 수업 듣는다");
		System.out.println("점심");
		System.out.println("오후 수업 듣는다");
		
		//랜덤발생기 (import 단축키 ctrl+shift+O)
		Random random = new Random();
		return random.nextBoolean(); //과제가 있다 없다?
	}
	
	public static void 이동(String 장소, String 탈것) {
		System.out.println(장소+"(으)로 "+탈것+"을(를) 이용하여 이동한다.");
	}
	
	
}
