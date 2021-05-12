import java.util.Scanner;

/**
 * Gives you a nickname by clipping off your name.
 * 
 * @author Aldwin Dennis Reyes
 */
public class Nickname {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name;
		String nickname;

		System.out.println("----------------");
		System.out.println("--  nickname  --");
		System.out.println("--    maker   --");
		System.out.println("----------------");
		System.out.println("");
		System.out.println("Program started..");
		System.out.println("What is your first name?");
		name = scanner.next();
		nickname = name.substring(0, 3).concat("s");

		// Substring(Beginning, end - 1) so taking substring of Aldwin with (0, 3) would
		// be Ald.
		// concat adds something to somewhere, it's like '+' but is different.
		// name var's first 3 characters would be taken and 's' would be added to the
		// end.

		System.out.println("");
		System.out.println("Your nickname would be " + nickname);

		// prints out result.

	}
}
