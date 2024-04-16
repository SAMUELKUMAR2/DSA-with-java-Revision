package BACKTRACKING;

public class Queen_on_1D_board {

	public static void main(String[] args) {
		
		boolean []board = new boolean[4];
		int q =2;
		Queen(board,q,0,"");
	}

	public static void Queen(boolean[] board, int q, int pq, String ans) {
		//pq = placedQueen
		if(q==pq) {
			System.out.println(ans);
			return;
		}
		for(int i =0;i<board.length;i++) {
			if(board[i]==false) {
				board[i] = true;
				Queen(board, q, pq+1, ans+"b"+i+"q"+pq);
				board[i]=false;
			}
	
			
		}
		
	}

}
