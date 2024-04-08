package ArrayList;
import java.util.*;

public class Array_list {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
//		ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println(arr);
		
		//Adding element in arrayList..
		arr.add(2);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		//Adding element at particular place. 
		arr.add(1,31);
		arr.add(2,43);
		System.out.println(arr);
		//removing element from ArrayList
		
		arr.remove(3);
		System.out.println(arr);
		
		//Update the element of ArrayList
		arr.set(1, 45);
		
		System.out.println("updated Array:"+arr);
		//Size of arrayList
		System.out.println("Size :"+arr.size());
		
		//get the element from particular index
		System.out.println(arr.get(3));
		
		//display all element in arrayList
		for(int i = 0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
	}

}
