/**
 * Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 * @author Arun cibi
 *
 */
package labexercise1;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    findPrime(n,scanner);
	}
	private static void findPrime(int n,Scanner scanner)
	{
		int count,index,index2;
		for(index=2;index<=n;index++)
		{
			count=0;
			for(index2=1;index2<=index;index2++)
			{
				if(index%index2==0)
					count++;
			}
		if(count==2)
		System.out.print(index+" ");
	   }
	}

}
