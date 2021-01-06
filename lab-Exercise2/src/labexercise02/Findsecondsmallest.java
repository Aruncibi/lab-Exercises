/**
		 * Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array
		 * @author Arun cibi
		 *
		 */
package labexercise02;
import java.util.Arrays;
import java.util.Scanner;
public class Findsecondsmallest {

			public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    int n=scanner.nextInt();
		    System.out.print(getSecondSmallest(n,scanner));
			}
			private static int getSecondSmallest(int n,Scanner scanner)
			{
			    int []arr=new int[n];
		        for(int index=0;index<n;index++)
		        arr[index]=scanner.nextInt();
			    Arrays.sort(arr);
			    return arr[1];
			}

		}
