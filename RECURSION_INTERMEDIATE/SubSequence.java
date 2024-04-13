package RECURSION_INTERMEDIATE;

public class SubSequence {

	public static void main(String[] args) {
		
		String s ="abc";
		Sequence(s,"");
		System.out.println(countSequence(s,""));
	}
	public static void Sequence(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = s.charAt(0);
		Sequence(s.substring(1),ans);
		Sequence(s.substring(1),ans+ch);
	}
	public static int countSequence(String s, String ans) {
	
		if(s.length()==0) {
//			System.out.println(ans);
			return 1;
		}
		char ch = s.charAt(0);
		int f1=countSequence(s.substring(1),ans);
		int f2=countSequence(s.substring(1),ans+ch);
		return f1+f2;
	}

}
