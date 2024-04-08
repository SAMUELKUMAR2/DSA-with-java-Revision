package RECURSION;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 3;
		int b= 4;
		//head recursive
		System.out.println(pow(a,b));
		//tail recursive
		System.out.println(power(a,b,1));
	}
	public static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		int ans = pow(a,(b-1));
		return a*ans;
	}
	public static int power(int a, int b,int ans) {
		if(b==0) {
			return ans;
		}
		return power(a,b-1,ans*a);
	}

}
