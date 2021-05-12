import java.util.Scanner;

public class TestCat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Square Maker");
		System.out.println("Please input square size S x S");
		int k = scan.nextInt();
		System.out.println("Please input square multiplier");
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

}
