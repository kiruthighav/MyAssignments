package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		//Declare an array for {3, 2, 11, 4, 6, 7}
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		
		//Declare another array for {1, 2, 8, 4, 9, 7}
		int[] arr2 = {1, 2, 8, 4, 9, 7};
		
		//Add array elements to a list
		List<Integer> l1 = new ArrayList<Integer>();
		for (Integer integer : arr1) {
			
			l1.add(integer);
		}
		List<Integer> l2 = new ArrayList<Integer>();
		for (Integer integer : arr2) {
			
			l2.add(integer);
		}
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("The matching values are:");
		
		//Iterate the values through the length of the list
		for (Integer integer : l1) {
			for (Integer integer2 : l2) {
				
				//compare the values
				if (integer == integer2) {
					//Print the values if they are equal
					System.out.print(" "+integer);
				}
			}
		}
		
	}

}
