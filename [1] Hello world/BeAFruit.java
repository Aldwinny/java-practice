import java.util.Scanner;

/**
 * This is me having fun with switch statements and learning about
 * {@code Math.random()}
 * 
 * @author Aldwin Dennis Reyes
 */
public class BeAFruit {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String X;
		int in;
		double Z;

		System.out.println("Please input number from 1~5");
		try {
			in = sca.nextInt();
		} catch (java.util.InputMismatchException e) {
			in = 9999;
		}
		Z = Math.random();

		if (Z <= 0.25) {
			switch (in) {
				case 1:
					System.out.println("You are an unlucky blueberry");
					X = "blueberry";
					break;
				case 2:
					System.out.println("You are an unlucky lemon");
					X = "lemon";
					break;
				case 3:
					System.out.println("You are an unlucky strawberry");
					X = "strawberry";
					break;
				case 4:
					System.out.println("You are an unlucky apple");
					X = "apple";
					break;
				case 5:
					System.out.println("You are an unlucky pineapple");
					X = "pineapple";
					break;
				case 9999:
					System.out.println("You didn't type a proper number and you are unlucky");
					X = "none";
					break;
				default:
					System.out.println("You typed a number that is not in the range and you are unlucky");
					X = "none";
					break;

			}
		} else {
			switch (in) {
				case 1:
					System.out.println("You are a lucky blueberry");
					X = "blueberry";
					break;
				case 2:
					System.out.println("You are a lucky lemon");
					X = "lemon";
					break;
				case 3:
					System.out.println("You are a lucky strawberry");
					X = "strawberry";
					break;
				case 4:
					System.out.println("You are a lucky apple");
					X = "apple";
					break;
				case 5:
					System.out.println("You are a lucky pineapple");
					X = "pineapple";
					break;
				case 9999:
					System.out.println("You didn't type a proper number, nevertheless, you are lucky");
					X = "none";
					break;
				default:
					System.out.println("You typed a number that is not in the range, nevertheless, you are lucky");
					X = "none";
					break;
			}

		}
		if (X == "blueberry" || X == "lemon" || X == "strawberry" || X == "apple" || X == "pine4apple") {
			if (Z <= 0.25) {
				System.out.println("At least you know how to go by the rules");
			} else {
				System.out.println("And you know how to go by the rules, how lovely");
			}
		} else {
			if (Z <= 0.25) {
				System.out.println("Plus, you suck.");
			} else {
				System.out.println("Oh well..");
			}
		}
		sca.close();

	}

}
