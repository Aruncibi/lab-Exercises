/**
 * Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 *@author Arun cibi
 *
 */
package labexercise02;
import java.util.Scanner;
import java.util.Arrays;
public class Sortintegers {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int arr[] = new int[n];
    for(int index=0;index<n;index++)
    arr[index]=scanner.nextInt();
    int a[]=getSorted(arr,scanner);
    Arrays.sort(a);
    for(int index=0;index<n;index++)
    	System.out.print(a[index]+" ");
	}
	private static int[] getSorted(int arr[],Scanner scanner)
	{
		int len=arr.length;
		int ar[]=new int[len];
		for(int index=0;index<len;index++)
		{
			int n1=arr[index];
			int r=0;
			int rm;
			while(n1!=0)
			{
			rm=n1%10;
			r=r*10+rm;
			n1=n1/10;
			}
			ar[index]=r;
		}
		return ar;
	}

}
