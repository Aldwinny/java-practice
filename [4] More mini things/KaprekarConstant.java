
import java.util.Scanner;

/**
 * My own implementation of getting the Kaprekar's constant.
 * 
 * @author Aldwin Dennis Reyes
 */
public class KaprekarConstant {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num1 = 0000;
		int trials = 0;
		boolean failed = false;

		System.out.println("Please enter a 4-digit number");

		boolean numError = true;

		while (numError) {
			if (sc.hasNextInt()) {
				num1 = sc.nextInt();
			} else {
				sc.next();
				System.out.println("Please enter a 4-digit number");
				continue;
			}
			numError = false;
		}

		while (num1 != 6174) {
			int[] increasing = sorter(toArray(num1), true);
			int[] decreasing = sorter(toArray(num1), false);

			int lower = toConcatenatedInt(increasing.clone());
			int higher = toConcatenatedInt(decreasing.clone());

			num1 = higher - lower;
			System.out.println("Now: " + num1);

			if (trials < 20) {
				trials++;
			} else {
				failed = true;
				break;
			}
		}

		if (failed) {
			System.out.println("Failed! Last number after 20 trials is: " + num1);
		} else {
			System.out.printf("Kaprekar's Constant (%d) achieved after: %d tries", num1, trials);
		}

	}

	// Turns a 4 digit Integer to Array, Ignores if number is more than 4-digit
	public static int[] toArray(int num) {
		String stringNum = String.valueOf(num);

		int[] finalArray = new int[4];

		try {
			for (int i = 0; i < stringNum.length(); i++) {
				finalArray[i] = Character.getNumericValue(stringNum.charAt(i));
			}
		} catch (Exception e) {
			System.out.println("Caught Index out of Bounds!");
		}

		return finalArray.clone();

	}

	// Calls on Sort.java to sort the Array
	public static int[] sorter(int[] kelp, boolean increasing) {
		Sort a = new Sort();
		return a.bubbleSort(kelp, increasing);
	}

	// Turns a size 4 array to integer
	public static int toConcatenatedInt(int[] array) {
		String stringArray = "";

		for (int i = 0; i < 4; i++) {
			stringArray = stringArray.concat(Integer.toString(array[i]));
		}

		return Integer.parseInt(stringArray);
	}

}
