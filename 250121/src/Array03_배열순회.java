import java.util.Arrays;

public class Array03_배열순회 {
	public static void main(String[] args) {
		int[] nums = {1,3,5,7,9};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
