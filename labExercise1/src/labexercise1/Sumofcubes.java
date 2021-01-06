/**
 * Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
 * @author Arun cibi
 *
 */
package labexercise1;
import java.util.Scanner;
public class Sumofcubes {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	System.out.print(cubesSum(n,scanner));
	}
	private static int cubesSum(int n,Scanner scanner)
	{
	int rem,sum=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	return sum;
	}

}
