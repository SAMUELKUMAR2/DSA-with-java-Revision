package SubString;
import java.util.Iterator;

public class SubString {

	public static void main(String[] args) {
		String str = "abcd";
		Substring(str);
	}
	public static void Substring(String str) {
		for(int i =0;i<=str.length();i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.print(str.substring(i,j)+" ");
				
			}
			System.out.println();
			}
		}

}
