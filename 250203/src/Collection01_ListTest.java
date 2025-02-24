import java.util.ArrayList;
import java.util.List;

public class Collection01_ListTest {
	public static void main(String[] args) {
		// List -> 순서가 있고, 중복이 가능
		// ArrayList(자바시간) / LinkedList(알고시간) / Vector(옛날거라 잘안써)
		
//		ArrayList<String> names = new ArrayList<String>(); <- 가능
		List<String> names = new ArrayList<>(); // <- 이렇게 쓸일이 더 많음
		
		//원소 추가
		names.add("이규진");
		names.add("박승연");
		names.add(0, "문지후");
		
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.isEmpty());
	}
}
