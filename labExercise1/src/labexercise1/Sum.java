/**
 * Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * @author Arun cibi
 *
 */
package labexercise1;

//import java.util.*;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int val=calculateSum(n,scanner);
		System.out.print(val);
	}
	public static int calculateSum(int n,Scanner scanner)
	{
		int sum=0;
		for(int index=1;index<=n;index++)
		{
			if(index%3==0 || index%5==0)
				sum=sum+index;
		}
		return sum;
	}

}
