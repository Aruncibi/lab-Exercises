/**
 * Exercise 3: The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. 
 * @author Arun cibi
 *
 */
package labexercise1;
import java.util.Scanner;
public class Fibonaci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		fibonaciSeries(n,scanner);
	}
		private static void fibonaciSeries(int n,Scanner scanner)
		{
		int []a = new int[n];
		a[0]=1;
		a[1]=1;
		int index;
		System.out.print(a[0]+" "+a[1]+" ");
		for(index=2;index<n;index++)
		{
		a[index]=a[index-2]+a[index-1];
		System.out.print(a[index]+" ");
		}
		}
	}
