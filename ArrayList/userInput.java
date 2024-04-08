package ArrayList;
import java.util.*;
public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr1= new ArrayList<>();
		System.out.println(arr1.size());
		
		int arr[] = {1,3,12,23,15};
		int i = 0;
		int j = 0;
		while(i<arr.length && j<5) {
		
			int e = arr[i];
			arr1.add(e);
			i++;
		}
		System.out.println(arr1);
	}

}
