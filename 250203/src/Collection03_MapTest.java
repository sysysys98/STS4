import java.util.HashMap;
import java.util.Map;

public class Collection03_MapTest {
	public static void main(String[] args) {
		//Map이란: 사전 같은 K-V(키-값) 쌍으로 이루어져 있음
		//키는 중복 허용 X / 값은 중복 가능 / 순서 없음(있는 종류도 있긴 함)
		
		Map<String, String> map = new HashMap<>();
		
		map.put("김희망", "Java");
		map.put("강건", "Java");
		map.put("전해지", "Python");
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		System.out.println(map.containsKey("김희망"));
		System.out.println(map.containsValue("Python"));
	}
}
