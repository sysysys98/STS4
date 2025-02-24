//문->정 / 정->문
public class String03_atoi_itoa {
	public static void main(String[] args) {
		String strNum = "123456";
		
		//문자열을 정수로 !
		int num  = Integer.parseInt(strNum);
		System.out.println(num);
		
		System.out.println(atoi(strNum));
		//그런데 만약에 strNum이 음수거나 실수라면 어케 숫자로 바꿀거임?
		
		String strNum2 = String.valueOf(num);
		String strNum3 = num+"";
	}
	
	static int atoi(String str) {
		int N = str.length();
		int num = 0;
		
		// str : 1, 2, 3, 4, 5, 6
		for(int i=0; i<N; i++) {
			char c = str.charAt(i);
			
			//음...이거숫자맞나...?(의심)
			if('0'<=c && c<='9') { //48, 57 들어가도 같은 의미
				num = (num*10)+(c-48); //자릿수 밀어주고 이 숫자 넣기
			} else {
				return Integer.MIN_VALUE;
			}
		}
		
		return num;
	}
}
