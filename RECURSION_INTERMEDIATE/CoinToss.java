package RECURSION_INTERMEDIATE;

public class CoinToss {

	public static void main(String[] args) {
		int coin =3;
		probability(coin,"");
	}
	public static void probability(int n,String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		probability(n-1,ans+"H");
		probability(n-1,ans+"T");
		
	}

}
