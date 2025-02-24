import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection07_SortTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("김");
		names.add("이");
		names.add("박");
		names.add("최");
		names.add("양");
		
		Collections.sort(names);
		System.out.println(names);
		
		int[] nums = {5,6,1,23,4};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
	}
}
