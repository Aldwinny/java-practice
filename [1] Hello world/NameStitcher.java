import java.util.Scanner;

/**
 * Does what it does. Stitches names. Plus a {@code Math.random()} that
 * determines your luck.
 * 
 * @author Aldwin Dennis Reyes
 */
class NameStitcher {
	public static void main(String Args[]) {
		Scanner name = new Scanner(System.in);
		String F, M, L;
		double X;
		System.out.println("Please input First name:");
		F = name.nextLine();
		System.out.println("Done");
		System.out.println("Please input Middle initials");
		M = name.nextLine();
		System.out.println("Done");
		System.out.println("Please input Last name");
		L = name.nextLine();
		System.out.println("Done");
		X = Math.random();

		if (X > 0.5) {
			System.out.print("Your name is " + F + " " + M + " " + L + ", cool name for someone like you.");
		} else {
			System.out.print("Your name is " + F + " " + M + " " + L + ", your name sucks.");
		}
	}
}
