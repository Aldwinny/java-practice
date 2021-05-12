import java.util.Scanner;

/**
 * One of the coolest things I did. Or so I thought. This is an app that allows
 * you to make a cool square, and know your BMI & Calorie Intake.
 * 
 * @author Aldwin Dennis Reyes
 */
public class interfacer {

	private static Scanner scan = new Scanner(System.in);
	private static double[] infos = new double[5];
	// 0 is age, 1 is weight, 2 is height, 3 is extra space for inches, 4 is gender
	// (1 for Male, 2 for Female).

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Hello, please enter your name\n");
		String name = scan.nextLine();
		int end = 3;
		infos(infos);
		while (end == 3) {
			welcomeMessage(name, infos);
			end = lobbyStream(end);
			end = dataStream(end);
		}
		if (end == 0) {
			endStream();
		}

	}

	private static double[] infos(double[] infos) {
		String butler;
		int maid = 1;
		while (maid == 1) {

			System.out.println("Please, enter your age");
			int age = scan.nextInt();
			infos[0] = age;
			if (infos[0] <= 0) {
				System.out.println("Is that a negative number I smell?");
			} else {
				maid = 2;
			}

		}

		while (maid == 2) {

			System.out.println("Are you male or female? M/F");
			butler = scan.next();
			if (butler.equalsIgnoreCase("m")) {
				System.out.println("OK");
				infos[4] = 1;
				maid = 3;
			} else if (butler.equalsIgnoreCase("f")) {
				System.out.println("OK");
				infos[4] = 2;
				maid = 3;
			} else {

			}
		}

		return infos;
	}

	private static void welcomeMessage(String name, double[] infos) {
		System.out.println("Your name is " + name + " and you are " + (int) infos[0] + " years old.");
		System.out.println("Welcome to the interfacer");
		System.out.println("Here are your choices");
		System.out.println("0. End this program.");
		System.out.println("1. make a square of numbers!");
		System.out.println("2. What's my BMI?");
		System.out.println("3. repeat this string of text.");
	}

	private static int lobbyStream(int end) {
		boolean hm = false;
		String response;

		while (hm == false) {
			response = scan.next();

			switch (response) {

				case "0":
					hm = true;
					end = 0;
					break;

				case "1":
					hm = true;
					end = 1;
					break;

				case "2":
					hm = true;
					end = 2;
					break;

				case "3":
					hm = true;
					end = 3;
					break;

				default:
					System.out.println("Unknown response, please try again.");
					hm = false;
					break;
			}
		}

		return end;
	}

	private static int dataStream(int end) {

		switch (end) {

			case 1:
				end = program1(end);
				break;

			case 2:
				end = program2(end);
				break;

			case 3:
				break;

		}
		return end;
	}

	private static void endStream() {
		System.out.println("Thank you for using the interfacer");
		System.out.println("Program will now be terminated");
	}

	private static int program1(int end) {
		// This is the square maker
		int butler;
		System.out.println("Square Maker");
		System.out.println("Please input square size S x S");
		int k = scan.nextInt();
		System.out.println("Please input number multiplier");
		int mult = scan.nextInt();
		int h = 0;

		for (int i = 0; i < k; i++) {
			for (int q = 0; q < k; q++) {
				System.out.print(h * mult + " ");
				h++;
			}
			h = 1 + i;
			System.out.println("");
		}

		System.out.println("\n" + "1. Repeat program?");
		System.out.println("2. Interfacer");
		System.out.println("3. End Program");

		butler = scan.nextInt();

		switch (butler) {

			case 1:
				end = 1;
				end = program1(end);
				break;

			case 2:
				end = 3;
				return end;

			case 3:
				end = 0;
				return end;
		}
		return end;
	}

	private static int program2(int end) {
		// This is the BMI getter

		int butler;
		String maid;
		String maid2;
		int maid1 = 1;
		if (infos[1] > 0) {
			maid1 = 2;
		}
		if (infos[2] > 0) {
			maid1 = 3;
		}
		boolean weightKG = false;
		boolean heightCM = false;

		System.out.println("BMI and Recommended Calorie Intake per day Calculator\n");
		while (maid1 == 1) {

			System.out.println("Is your weight in Kilogram? Y/N");
			maid = scan.next();
			if (maid.equalsIgnoreCase("y")) {

				System.out.println("OK");
				System.out.println("What would be your weight? max. 2 decimals, kilograms");
				infos[1] = scan.nextDouble();

				if (infos[1] > 0) {
					weightKG = true;
					maid1 = 2;
				} else {
					System.out.println("Is that a negative number I smell?");
				}

			} else if (maid.equalsIgnoreCase("n")) {

				System.out.println("OK");
				System.out.println("What would be your weight? max. 2 decimals, pounds");
				infos[1] = scan.nextDouble();

				if (infos[1] > 0) {
					maid1 = 2;
				} else {
					System.out.println("Is that a negative number I smell?");
				}

			} else {
				System.out.println("Error, not a response");
			}

		}

		while (maid1 == 2) {

			System.out.println("Is your height in Centimeters? Y/N");
			maid = scan.next();
			if (maid.equalsIgnoreCase("y")) {

				System.out.println("OK");
				System.out.println("What would be your height? max. 2 decimals, centimeters");
				infos[2] = scan.nextDouble();

				if (infos[2] > 0) {
					heightCM = true;
					maid1 = 3;
				} else {
					System.out.println("Is that a negative number I smell?");
					infos[2] = 0;
				}

			} else if (maid.equalsIgnoreCase("n")) {

				System.out.println("OK");
				System.out.println((int) infos[2] + " feet " + (int) infos[3] + " inches");
				System.out.println("How many feet? Must be positive whole number");
				infos[2] = scan.nextDouble();
				System.out.println((int) infos[2] + " feet " + (int) infos[3] + " inches");
				System.out.println("How many inches? Must be positive whole number");
				infos[3] = scan.nextDouble();
				System.out.println((int) infos[2] + " feet " + (int) infos[3] + " inches");
				System.out.println("OK, got it.");

				if (infos[2] > 0 && infos[3] > 0) {
					maid1 = 3;
				} else {
					System.out.println("Is that a negative number I smell?");
					infos[2] = 0;
					infos[3] = 0;
				}

			} else {

			}

		}

		double weightinKG;
		double heightinCM;
		int bmi;
		int kcal = 0;
		int s = 0;
		if (infos[4] == 1) {
			s = 5;
		} else if (infos[4] == 2) {
			s = -161;
		}

		if (weightKG == true) {
			weightinKG = infos[1];
		} else {
			weightinKG = infos[1] / 2.2;
		}

		if (heightCM == true) {
			heightinCM = infos[2];
		} else {
			heightinCM = ((infos[2] * 12) + infos[3]) * 2.54;
		}

		bmi = (int) (weightinKG / ((heightinCM / 100) * (heightinCM / 100)));

		while (maid1 == 3) {

			System.out.println("Do you want to see your recommended calorie intake per day? Y/N");
			maid2 = scan.next();
			if (maid2.equalsIgnoreCase("y")) {

				if (infos[0] < 14 || infos[0] > 80) {
					System.out
							.println("You must be between 15 and 80 to use this calculator (for the sake of accuracy)");
					kcal = 0;
					maid1 = 4;
				} else {
					System.out.println("Got it!");
					kcal = (int) ((10 * weightinKG) + (6.25 * heightinCM) - (5 * (int) infos[0]) + (s));
					maid1 = 4;

				}

			} else if (maid2.equalsIgnoreCase("n")) {

				System.out.println("OK");
				kcal = 0;
				maid1 = 4;

			} else {

			}

		}

		System.out.println();
		if (kcal == 0) {
			if (bmi <= 18) {
				System.out.println("You are underweight, BMI: " + bmi);
			} else if (bmi > 18 && bmi < 25) {
				System.out.println("You are normal, BMI: " + bmi);
			} else if (bmi > 24 && bmi < 30) {
				System.out.println("You are overweight, BMI: " + bmi);
			} else if (bmi > 29 && bmi < 40) {
				System.out.println("You are obese, BMI: " + bmi);
			} else {
				System.out.println("You are extremely obese, BMI:" + bmi);
			}
		} else {
			if (bmi <= 18) {
				System.out.println("You are underweight, BMI: " + bmi);
				System.out.println("Your daily calorie expenditure is " + kcal + " kcal/day");
			} else if (bmi > 18 && bmi < 25) {
				System.out.println("You are normal, BMI: " + bmi);
				System.out.println("Your daily calorie expenditure is " + kcal + " kcal/day");
			} else if (bmi > 24 && bmi < 30) {
				System.out.println("You are overweight, BMI: " + bmi);
				System.out.println("Your daily calorie expenditure is " + kcal + " kcal/day");
			} else if (bmi > 29 && bmi < 40) {
				System.out.println("You are obese, BMI: " + bmi);
				System.out.println("Your daily calorie expenditure is " + kcal + " kcal/day");
			} else {
				System.out.println("You are extremely obese, BMI:" + bmi);
				System.out.println("Your daily calorie expenditure is " + kcal + " kcal/day");
			}

		}

		System.out.println("\n" + "1. Repeat program?");
		System.out.println("2. Interfacer");
		System.out.println("3. End Program");

		butler = scan.nextInt();

		switch (butler) {

			case 1:
				end = 2;
				infos[1] = 0;
				infos[2] = 0;
				infos[3] = 0;
				end = program2(end);
				break;

			case 2:
				end = 3;
				infos[1] = 0;
				infos[2] = 0;
				infos[3] = 0;
				return end;

			case 3:
				end = 0;
				return end;
		}

		return end;

	}

}
