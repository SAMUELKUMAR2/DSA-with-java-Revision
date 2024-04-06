package STRING;

public class checkContentEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
//		String s2 = "hello";
		String s2 = new String("hellot");
//		System.out.println(s1.equals(s2));
		System.out.println(equal(s1,s2));
	}
	public static boolean equal(String s1,String s2) {
		if(s1==s2) {
			return true;
		}
		else if(s1.length()!=s2.length()) {
			return false;
		}
		else {
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
			
		}
		}
		return true;
		
	}

}
