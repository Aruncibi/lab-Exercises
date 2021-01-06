/**
 * Exercise 7: Create a method to check if a number is an increasing number
 * @author Arun cibi
 *
 */
package labexercise1;
import java.util.Scanner;
public class Checknumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n=scanner.nextLong();
		if(checkNumber(n,scanner)==true)
			System.out.print("In increasing order");
		else
			System.out.print("Not in increasing order");
	}
	public static boolean checkNumber(long n,Scanner scanner)
	{
		long r,index=n%10;
		n=n/10;
		while(n!=0)
		{
			r=n%10;
			if(r>index)
			return false;
			index=r;
			n=n/10;
		}
		return true;
	}

}
