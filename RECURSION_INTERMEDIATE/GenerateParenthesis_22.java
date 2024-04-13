package RECURSION_INTERMEDIATE;
import java.util.*;
public class GenerateParenthesis_22 {

	public static void main(String[] args) {
		ArrayList<String> ll = new ArrayList<>();
		int n =3;
		System.out.println(generate(n,0,0,"",ll));
	}
	public static ArrayList<String> generate(int n,int open,int close,String ans,ArrayList<String> ll) {
		if(close==n && open==n) {
//			System.out.println(ans);
			ll.add(ans);
			return ll;
		}
		//open
		if(open<n) {
		generate(n,open+1,close,ans+"(",ll);
		}
		//close
		if(close<open) {
		generate(n,open,close+1,ans+")",ll);
		}
		return ll;
	}
}
