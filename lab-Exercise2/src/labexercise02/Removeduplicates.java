/**
 * Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
 *@author Arun cibi
 *
 */
package labexercise02;
import java.util.Scanner;
import java.util.Arrays;
public class Removeduplicates {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int arr[] = new int[n];
    for(int index=0;index<n;index++)
    arr[index]=scanner.nextInt();
    int as[]=modifyArray(arr,scanner);
    for(int index=as.length-1;index>=0;index--)
    	System.out.print(as[index]+" ");
	}
	private static int[] modifyArray(int []ar,Scanner scanner)
	{
		int len=ar.length;
		int i=0;
		Arrays.sort(ar);
		for(int index=0;index<len-1;index++)
		{
			if(ar[index]!=ar[index+1])
				ar[i++]=ar[index];
		}
		ar[i++]=ar[len-1];
		int a[]=new int[i];
		for(int index=0;index<i;index++)
		a[index]=ar[index];
		return a;
	}

}
