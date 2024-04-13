package RECURSION_INTERMEDIATE;

public class CheckValid_Parenthesis_2116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "))()))";
		String locked = "010100";
		System.out.println(Validate(s,locked));
	}
	public static boolean Validate(String s, String  lock) {
		int open =0;
		int close = 0;
		if(lock.charAt(0)=='1' && s.charAt(0)==')') {
			return false;
		}
		for(int i =0;i<lock.length();i++) {
			if(s.charAt(i)==0) {
				generate(s,0,0,lock);
			}
		}
		return true;
	}
	public static boolean generate(String s, int open, int close, String lock) {
		
		return true;
	}

}
