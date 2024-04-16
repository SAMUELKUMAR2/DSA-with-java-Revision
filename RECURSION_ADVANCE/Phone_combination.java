package RECURSION_ADVANCE;

import java.util.ArrayList;
import java.util.List;

public class Phone_combination {

	static String key[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String str ="23";
		System.out.println(AlldigitToletter(str,"",list));
		

	}
	public static List<String> AlldigitToletter(String str,String ans,List<String> list) {
		
		if(str.length()==0) {
			list.add( ans);
			return list;
		}
		char ch = str.charAt(0);
		String pressed = key[ch-48];
		for(int i =0;i<pressed.length();i++) {
		
			
			AlldigitToletter(str.substring(1), ans+pressed.charAt(i),list);
		}
		
		return list;
	}

}
