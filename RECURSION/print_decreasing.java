package RECURSION;

public class print_decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Decreasing:-");
		pd(n);
		System.out.println("Increasing:");
		pi(n);
	}
	public static void pd(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		pd(n-1);
		
	}
	public static void pi(int n) {
		if(n==0) {
			return;
		}
		pi(n-1);
		System.out.println(n);
	}

}
