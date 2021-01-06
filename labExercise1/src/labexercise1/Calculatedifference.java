/**
 * Exercise6: Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 * @author Arun cibi
 *
 */
package labexercise1;
//import java.lang.Math;
import java.util.Scanner;
public class Calculatedifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int val=calculateDifference(n,scanner);
		System.out.print(val);
	}
	public static int calculateDifference(int n,Scanner scanner)
	{
		int sum1=0,sum2,sum3=0,sum,index;
		for(index=1;index<=n;index++)
			sum1=sum1+index;
		//sum=Math.pow(sum1,2);
		sum=sum1*sum1;
		for(index=1;index<=n;index++)
		{
			sum2=(index*index);
		    sum3=sum3+sum2;
		}
		    return sum3-sum;
		
	}

}
