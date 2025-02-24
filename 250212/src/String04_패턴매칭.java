
public class String04_패턴매칭 {
	public static void main(String[] args) {
		String text = "This iss a book";
		String p = "iss";
		
		System.out.println(MatchingFor(text, p));
		
	}
	
	static int MatchingFor(String t, String p) {
		//for문으로 만들자 만들자
		int N = t.length();
		int M = p.length();
		
		for(int i=0; i<N-M+1; i++) {
			boolean isOk = true;
			for(int j=0; j<M; j++) {
				if(t.charAt(i+j) != p.charAt(j)) {
					isOk = false;
					break;
				}
			}
			if (isOk) {
				return i;
			}
		}		
		return -1;
	}
	
	//마숙
	static int MatchingWhile(String t, String p) {
		//while문으로 만들자 만들자
		int N = t.length();
		int M = p.length();
		
//		for(int i=0; i<N-M+1; i++) {
//			boolean isOk = true;
//			for(int j=0; j<M; j++) {
//				if(t.charAt(i+j) != p.charAt(j)) {
//					isOk = false;
//					break;
//				}
//			}
//			if (isOk) {
//				return i;
//			}
//		}		
		return -1;
	}
}
