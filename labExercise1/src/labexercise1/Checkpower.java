/**
 * Exercise 8: Create a method to check if a number is a power of two or not
 * @author Arun cibi
 *
 */
package labexercise1;
import java.util.Scanner;
public class Checkpower {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n=scanner.nextLong();
    if(checkNumber(n,scanner)==true)
    	System.out.print("power of 2");
    else
    	System.out.print("Not a power of 2");
	}
	public static boolean checkNumber(long n,Scanner scanner)
	{
		while(n!=1)
		{
			if(n%2!=0)
			return false;
			n=n/2;
		}
		return true;
	}

}
