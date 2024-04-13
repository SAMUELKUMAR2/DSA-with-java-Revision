package RECURSION_INTERMEDIATE;

import java.util.Stack;

public class Valid_Parenthesis {

	public static void main(String[] args) {
//		String s = "()[]{}";
		String s ="()";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		
		for(int i =0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(isopen(ch)) {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
				
					return false;
				}
				else if(!isMatching(ch,st.peek())) {
					
					return false;
				}
				else {

					System.out.println("p");
					st.pop();
				}
			}
			
		}
		return st.isEmpty();
	}
	public static boolean isopen(char ch) {
		if(ch=='(' || ch=='{' || ch=='[') {
			return true;
		}
		return false;
		
	}
	public static boolean isMatching(char ch,char top) {
		
		if(ch=='(' && top==')'|| ch=='{'&& top=='}' || ch=='[' && top==']') {
			return true;
		}
		return false;
	}
		

	}


