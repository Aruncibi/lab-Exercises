/**
 * Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. 
 *@author Arun cibi
 *
 */
package labexercise02;
import java.util.Arrays;
import java.util.Scanner;
public class Sortstring {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    String []st=sortStrings(n,scanner);
    int limit1=0;
    if(n%2==0)
    limit1=n/2;
    else if(n%2==1)
    limit1=(n/2)+1;
    for(int index=0;index<limit1;index++)
        System.out.print(st[index].toUpperCase()+" ");
    for(int index=limit1;index<n;index++)
    	System.out.print(st[index].toLowerCase()+" ");
	}
	private static String[] sortStrings(int n,Scanner scanner)
	{
	    String []str=new String[n];
		for(int index=0;index<n;index++)
        str[index]=scanner.next();
		Arrays.sort(str);
		return str;
	}
		

}
