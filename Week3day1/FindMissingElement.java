package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {

		int i[]= {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> l = new ArrayList<Integer>();
		for (Integer integer : i) {
			l.add(integer);
		}
		
		System.out.println("Before sorting: "+l);
		Collections.sort(l);
		System.out.println("After sorting: "+l);
		for (int j = 0; j < l.size()-1; j++) {
			if (l.get(j)+1 != l.get(j+1)) {
				int m = l.get(j)+1;
				System.out.println("The missing elements are: "+ m);	
			}
			
		}
			
		}
	}

