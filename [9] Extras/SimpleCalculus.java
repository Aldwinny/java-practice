import java.util.Scanner;

/**
 * Me trying to implement a simple derivative but failed to do so.
 * 
 * @author Aldwin Dennis Reyes
 */
public class SimpleCalculus {

	static Scanner input = new Scanner(System.in);
	static String var;

	public static void main(String[] args) {
		String unprocessedInput;
		unprocessedInput = input.next();
		var = input.next();
		switch (errorChkNum(unprocessedInput)) {
			case 0:
				System.out.println("Error code 0: Variable is not in place or other symbols and letters exist");
				break;
			case 1:
				System.out.println("Completed code 1: Variable at place, proceed to differentiation");
				break;
			case 2:
				System.out.println("Error code 2: Symbols and letters exists in unexpected places");
				break;
			case 3:
				System.out.println("Completed code 3: Equation is all numbers");
				break;
		}

	}

	public static int errorChkNum(String read) {

		char ch = var.charAt(0);
		boolean ifVarAtPlace = false;
		boolean ifVarExists = false;

		for (int i = read.length() - 1; i >= 0; i--) {

			if (read.charAt(i) == ch) {
				ifVarExists = true;
				break;
			}

		}

		for (int i = read.length() - 1; i >= 0; i--) {

			if (read.charAt(i) == '0' || read.charAt(i) == '1' || read.charAt(i) == '2' || read.charAt(i) == '3'
					|| read.charAt(i) == '4' || read.charAt(i) == '5' || read.charAt(i) == '6' || read.charAt(i) == '7'
					|| read.charAt(i) == '8' || read.charAt(i) == '9') {

				continue;

			} else {

				if (i == read.length() - 1 && read.charAt(i) == var.charAt(0)) {
					if ("none".equals(var)) {
						ifVarAtPlace = false;
						break;
					} else {
						ifVarAtPlace = true;
						continue;
					}
				}

				ifVarAtPlace = false;
				break;
			}
		}

		if (ifVarExists) {
			if (ifVarAtPlace) {
				return 1;
			}
			return 0;
		} else {
			if (ifVarAtPlace) {
				return 2;
			}
			return 3;
		}
	}

	public static int calcInt() {
		return 0;

	}

}
