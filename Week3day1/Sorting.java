package week3.day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sorting {

	public static void main(String[] args) {

		List<String> companyNames = new ArrayList<String>();
		companyNames.add("HCL");
		companyNames.add("Wipro");
		companyNames.add("Aspire Systems");
		companyNames.add("CTS");
		
		System.out.println("Before sorting: "+companyNames);
		Collections.sort(companyNames);
		System.out.println("After sorting: "+companyNames);
		System.out.println("Required output: ");
		for (int i = companyNames.size()-1; i>= 0; i--) {

			System.out.print(" "+companyNames.get(i));
			
		}
	}

}
