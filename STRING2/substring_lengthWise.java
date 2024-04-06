package STRING2;

public class substring_lengthWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		lengthwise(s);
	}
	
public static void lengthwise( String s) {

		for(int len = 1;len<=s.length();len++) {
			for(int j = len;j<=s.length();j++) {
				int k = j-len;
				System.out.println(s.substring(k,j)+" ");
			}
			
//		}
		}
	}

}
