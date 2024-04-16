package BACKTRACKING2;

import java.util.Scanner;

public class Rat_Game {
	static boolean existPath = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [][] maze= new char[n][m];
		for(int i=0;i<maze.length;i++) {
			String st = sc.next();
			for(int j = 0;j<st.length();j++) {
				maze[i][j] = st.charAt(j);
			}
		}
		int ans[][] = new int[n][m];
		RatPath(maze,0,0,ans);
		
	}
	public static void RatPath(char [][]maze,int cr,int cc,int [][]ans) {
		if(cc==maze[0].length-1 && cr==maze.length-1) {
			if(maze[cr][cc]=='o') {
				existPath =true;
				ans[cr][cc]=1;
			}
			display(ans);
			return;
		}
		if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X') {
			return;
		}
		int []r = {-1,1,0,0};
		int []c = { 0,0,-1,1};
		maze[cr][cc] = 'X';
		ans[cr][cc]=1;
		for(int i=0;i<c.length;i++) {
			RatPath(maze,cr+r[i],cc+c[i],ans);	
		}
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	public static void display(int [][]ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

//oXoo
//oooX
//XXoX
//XXoo