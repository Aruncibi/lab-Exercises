/**
 * Exercise 2: Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
 * @author Arun cibi
 *
 */
package labexercise1;
import java.util.Scanner;
public class Trafficlight {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.next();
    System.out.print(displayLight(str,scanner));
	}
	private static String displayLight(String st,Scanner scanner)
	{
		if(st.equals("red"))
			return "stop";
		else if(st.equals("yellow"))
			return "wait";
		else if(st.equals("green"))
			return "go";
		return null;
	}

}
