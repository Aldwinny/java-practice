package SimpleMessage;

import java.util.Scanner;

/**
 * Sometime I question why I name my classes this way.
 * 
 * @author Aldwin Dennis Reyes
 */
public class Ron {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Cali Cal = new Cali();

		System.out.println("Enter your name here: ");
		String name = input.nextLine();

		Cal.Text(name);

	}

}
