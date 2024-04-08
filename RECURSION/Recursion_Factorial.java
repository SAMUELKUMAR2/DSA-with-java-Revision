package RECURSION;

public class Recursion_Factorial {

	public static void main(String[] args) {
	int n = 5;
//	using head recursion
	System.out.println(fac(n));
	
//	using tail recursion
	System.out.println(fact(n,1));
	}

	public static int fac(int n) {
		if(n==1) {
			return 1;
		}
		int fn = fac(n-1); // head recursion
		return n*fn;
	}

	public static int fact(int n , int ans) {
		if(n==1) {
			return ans;
		}
		return fact(n-1, ans*n);
	}
	

}
