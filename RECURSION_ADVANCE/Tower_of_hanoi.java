package RECURSION_ADVANCE;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		
		int n =3;
		printSteps(n,"A","B","C");
		
	}
	public static void printSteps(int n, String s, String h,String d) {
		//s-src h-helper d-destination
		if(n==0) {
			return;
		}
		printSteps(n-1,s,d,h); //helper
		System.out.println("Move" +n+"th disc from "+s+" to "+d);
		printSteps(n-1, h, s, d);
	}
	

}

