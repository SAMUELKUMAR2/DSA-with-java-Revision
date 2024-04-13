package Permutation_and_Combination;

public class AllPath {

	//All possible path to reach at target location
	public static void main(String[] args) {
		//target(4,4)
		String s = "123";
		
		int m =3;
		int n =3;
		printPath(m-1,n-1,0,0,"");
	}
	public static void printPath(int row,int col, int cr, int cc,String ans) {
		if(cr==row && cc==col) {
			System.out.println(ans);
			return;
		}
		if(cr>row || cc>col) {
			return;
		}
		printPath(row,col,cr,cc+1,ans+"H");
		printPath(row,col,cr+1,cc,ans+"V");
	}

}
