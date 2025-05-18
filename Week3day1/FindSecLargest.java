package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecLargest {

	public static void main(String[] args) {

		//Declare an arrayList
		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		
		System.out.println("Before sorting: "+a);
		Collections.sort(a);
		System.out.println("After sorting: "+a);
		System.out.println("The Second Largest number present is "+ a.get(a.size()-2));
	}

}
