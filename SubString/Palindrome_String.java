package SubString;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "nitin";
		Palindrome(str);
	}
	public static void Palindrome(String str) {
		for(int i =0;i<=str.length();i++) {
			for(int j =i+1;j<=str.length();j++) {
				
				String s = str.substring(i,j);
				if(isPalindrome(s)) {
					System.out.print(str.substring(i,j)+" ");
					
				}
			}
			System.out.println();
		}
		
	}
	public static boolean isPalindrome(String str) {
		int i =0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
