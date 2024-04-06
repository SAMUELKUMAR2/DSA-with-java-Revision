package STRING;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hey");
		String s4 = new String ("hey");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		// Addition of string
		String s5 = s2+s3;
		System.out.println(s5);
		

	}

}
