package STRING2;

import java.util.Scanner;

//https://codeskiller.codingblocks.com/problems/165
//constraints- 1 <= Length of strings of digits <= 17
public class FindingCB_Numbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int m =sc.nextInt();
		String str = sc.next().substring(0,m);
		
		System.out.println(CountcbNumber(str));
	}
	public static int CountcbNumber(String str) {
		int count = 0;
		boolean [] visited = new boolean[str.length()];
		for(int l = 1;l<=str.length();l++) {
			for(int j = l;j<=str.length();j++) {
				int i = j-l;
				String s = str.substring(i,j);
				long n = Long.parseLong(s);
				
				if(IsCbNumbers(n)==true && isValid(visited,i,j-1) == true) {
					count++;
					for(int k = i;k<j;k++) {
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}
	public static boolean isValid(boolean[] visited,int i , int j) {
		for(;i<=j;i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		return true;
	}
	public static boolean IsCbNumbers(long n) {
		if(n==0 || n==1) {
			return false;
		}
		int []arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i = 0;i<arr.length;i++) {
		if(arr[i]==n) {
			return true;
		}
		}
		for(int i = 0;i<arr.length;i++) {
			if(n%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
