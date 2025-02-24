import java.util.Arrays;

public class String02_회문 {
	public static void main(String[] args) {
		String str = "다시합창합시다";
		int n = str.length();
		//1. 뒤집기(반복문)
		char[] arr1 = new char[n];
		for(int i=0; i<str.length(); i++) {
			arr1[i] = str.charAt(n-1-i);
		}
		System.out.println(Arrays.toString(arr1));
		
		//2. StringBuilder
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.reverse()); //이건 그냥 sb 객체고(출력이 되는 이유는 sb도 toString메서드를 갖고있어서)
		String tmp = sb.reverse().toString(); //요래 하면 string으로 됨
		
		System.out.println(sb.reverse().getClass()); //class java.lang.StringBuilder

		//3. swap
		char[] arr2 = str.toCharArray();
		
		for(int i=0; i<n/2; i++) {
			char temp = arr2[i];
			arr2[i] = arr2[n-1-i];
			arr2[n-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr2));
		//물론 실제로 뒤집지 않아도 회문인지 여부는 확인 할 수 있당(비교만하면되니까)
		
		}
	}

