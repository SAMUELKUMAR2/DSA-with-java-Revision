package BACKTRACKING;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2,3,4,5,6};
		int amount =10;
		Combination(coins, amount, "",0);

	}
public static void Combination(int []c,int a,String ans,int idx) {
		
		if(a==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<c.length;i++) {
			if(a>=c[i]) {
	
				 Combination(c, a-c[i], ans+c[i],i);
			}
		}
	}

}
