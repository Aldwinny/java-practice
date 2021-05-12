import java.util.Arrays;

/**
 * This is me studying the Arrays class
 * 
 * @author Aldwin Dennis Reyes
 */
public class Arrays1 {

	public static void main(String[] args) {

		/*
		 * USING ARRAYS AND PRINTING ARRAYS THERES Arrays.sort WHICH SORTS NUMBERS IN AN
		 * ARRAY THERES Arrays.equals(a, b) WHICH CHECKS IF 2 NUMBERS ARE EQUAL BUT U
		 * CAN USE a.equals(b) THERES Arrays.toString WHICH PRINTS THE ARRAY AS A STRING
		 * [1, 2, 3,...] THERES Arrays.fill(name, rangestart, rangeend, filler) WHICH
		 * FILLS ARRAY name WITH VALUES FROM rangestart TO rangeend WITH filler
		 * INITIALIZE ARRAY: vartype[] varname; ADD ARRAY VALUE varname[index] =
		 * whattoadd; INITIALIZE ARRAY AND CAPACITY: vartype[] varname = new
		 * vartype[arraysize - 1];
		 */

		byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
		String arrayAsString = Arrays.toString(famousNumbers); // [0, 1, 2, 4, 8, 16, 32, 64]
		System.out.println(arrayAsString);

		long[] bigNumbers = { 200000000L, 400000000L, 100000000L, 300000000L }; // it's unsorted

		Arrays.sort(bigNumbers); // sorting whole array ascending order

		System.out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]

		int[] numbers1 = { 1, 2, 5, 8 };
		int[] numbers2 = { 1, 2, 5 };
		int[] numbers3 = { 1, 2, 5, 8 };

		System.out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
		System.out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"

		int size = 10;
		char[] characters = new char[size];

		// It takes an array, start index, end index (exclusive) and the value for
		// filling the array
		Arrays.fill(characters, 0, size / 2, 'A');
		Arrays.fill(characters, size / 2, size, 'B');

		System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
	}

}
