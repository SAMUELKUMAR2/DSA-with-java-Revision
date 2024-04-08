package RECURSION;
import java.util.*;
public class search_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,4,3,4,2,5,4,6,8};
		int item = 4;
		Arrays.sort(arr);
		System.out.println("Sorted:-");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(search(arr,item,0));

	}
	public static int search(int []arr,int item,int i) {
		if(i==arr.length) {
			return -1;
		}
		
			if(arr[i]==item) {
				
				return i;
		
		}
		return search(arr, item,i+1);
	}

}
