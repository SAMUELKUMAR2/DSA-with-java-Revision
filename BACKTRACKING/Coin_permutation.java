package BACKTRACKING;

public class Coin_permutation {

	public static void main(String[] args) {
		
		int[] coins = {2,3,4,5,6};
		int amount =10;
		permutation(coins,amount,"");
	}
	public static void permutation(int []c,int a,String ans) {
		
		if(a==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<c.length;i++) {
			if(a>=c[i]) {
				//backtracking
//				a=a-c[i];
//				permutation(c,a,ans+c[i]);
//				a=a+c[i];
				//without backtracking
				permutation(c, a-c[i], ans+c[i]);
			}
		}
	}

}
