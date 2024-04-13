package Permutation_and_Combination;

public class Permutation_without_dubplicate {

	//permutation of string without repeating string
	public static void main(String[] args) {
		String s = "abca";
		permutation(s,"");
	}
	public static void permutation(String s,String ans) {
		
		
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			String left = s.substring(0,i)+s.substring(i+1);
			boolean duplicate = false;
			for(int j= i+1;j<s.length();j++) {
				if(s.charAt(j)==ch) {
					duplicate = true;
					break;
				}
			}
			//if there is not duplicate then run call recursion
			if(duplicate==false) {
				permutation(left,ans+ch);
				
			}
		}
	}

}
