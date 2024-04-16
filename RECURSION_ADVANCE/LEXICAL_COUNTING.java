package RECURSION_ADVANCE;

public class LEXICAL_COUNTING {

	public static void main(String[] args) {
		int n = 1000;
		
		lexicalcount(0,n);
	}
	public static void lexicalcount(int curr,int n ) {
		if(curr>n) {
			return;
		}
		
		System.out.println(curr);
		int i =0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexicalcount(curr*10+i, n);
		}
	}

}
