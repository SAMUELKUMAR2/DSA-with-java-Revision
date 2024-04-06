package STRING;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
//		String s = "nitin";
		
		System.out.println(IsPalindrome(s));
	}
	public static boolean IsPalindrome(String s) {
		int i= 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
