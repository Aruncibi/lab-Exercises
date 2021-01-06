/**
 * Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 *@author Arun cibi
 *
 */
package labexercise3;
import java.util.StringTokenizer;  
public class stringTokenizerclass {

	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("1 2 3 4");
		 int sum=0;
	     while (st.hasMoreTokens()) {  
	    	 int n=Integer.parseInt(st.nextToken());
	         sum=sum+n;;  
	     }  
         System.out.println(sum);  

	}

}
