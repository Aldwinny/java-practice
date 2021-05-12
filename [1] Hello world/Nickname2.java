import java.util.Scanner;

/**
 * A more advanced nickname maker, I guess.class
 * 
 * @author Aldwin Dennis Reyes
 */
public class Nickname2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, trimName, nickName;
		boolean check1 = false;

		System.out.println("----------------");
		System.out.println("--  nickname  --");
		System.out.println("--    maker   --");
		System.out.println("----------------");
		System.out.println("");
		System.out.println("Program started..");
		System.out.println("What is your first name?");

		name = scanner.next();
		trimName = name.trim().substring(0, 3);

		if (trimName.endsWith("c")) {

			trimName = name.trim().substring(0, 4);

			if (trimName.endsWith("h")) {

				nickName = trimName;
				check1 = true;

			} else {

				trimName = name.trim().substring(0, 3);

			}

		}

		if (trimName.endsWith("a") || trimName.endsWith("e") || trimName.endsWith("i") || trimName.endsWith("o")
				|| trimName.endsWith("u") || check1) {

			nickName = trimName;

		} else {

			nickName = trimName.concat("s");

		}

		System.out.println(nickName);

	}
}
