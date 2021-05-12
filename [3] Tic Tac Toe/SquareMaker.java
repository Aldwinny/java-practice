import java.util.Scanner;

public class SquareMaker {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		intro();
		int k = scan.nextInt();
		mult();
		int mult = scan.nextInt();
		int h = 0;

		// Variables Initialized, Program will now start.

		for (int i = 0; i < k; i++) {
			for (int q = 0; q < k; q++) {
				// this for loop prints a straight line of numbers
				System.out.print(h * mult + " ");
				h++;
			}
			// this for loop changes h value then creates new line
			// until the square required is satisfied
			h = 1 + i;
			System.out.println("");
		}
	}

	private static final void intro() {
		System.out.println("Square Maker");
		System.out.println("Please input square size S x S");
	}

	private static final void mult() {
		System.out.println("Please input square multiplier");
	}

}
