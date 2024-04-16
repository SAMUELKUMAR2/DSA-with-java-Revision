package BACKTRACKING2;

public class PartitionOf_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		Partitioning(s,"");
	}
	public static void Partitioning(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i =1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			Partitioning(ques.substring(i),ans+s+"|");
		}
	}
//	***** When list is necessary****
	
//	public static void Partitioning(String ques,List<String> ll) {
//		if(ques.length()==0) {
//			System.out.println(ll);
//			return;
//		}
//		for(int i =1;i<=ques.length();i++) {
//			String s = ques.substring(0,i);
//			
//			ll.add(s+"|");
//			Partitioning(ques.substring(i),ll);
//			ll.remove(ll.size()-1);
//		}
//	}


}
