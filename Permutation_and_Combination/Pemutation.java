package Permutation_and_Combination;

public class Pemutation {

	public static void main(String[] args) {
		String s ="abc";
		permutation(s,"");
	}
	public static void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i =0;i<s.length();i++) {
			char ch =s.charAt(i);
			String leftString = s.substring(0,i)+s.substring(i+1);
			permutation(leftString,ans+ch);
		}
	}

}
