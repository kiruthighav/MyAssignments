package week1.day2;

public class IsPrime {

	public static void main(String[] args) {

		int n = 13;
		int count = 0;
		
		if (n>1) 
		{
			
			for (int i = 1; i <=n; i++)
			{
				if (n % i == 0)
					count++;
			}	
				if (count == 2) 
			{
					System.out.println("The number "+ n +" is a Prime number");
			}
				else 
				{
					System.out.println("The number " + n + " is not a Prime number");
				}
		}
		
		else
		{
				System.out.println("The number " + n + " is not a Prime number");
		}
}
}
 

	