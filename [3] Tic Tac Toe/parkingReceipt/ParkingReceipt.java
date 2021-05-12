package parkingReceipt;

import java.util.Scanner;

/**
 * A code assignment that my friend has. It was originally supposed to be done
 * in MatLab but then I did it in Java.
 * 
 * @author Aldwin Dennis Reyes
 */
public class ParkingReceipt {

	static String vehicle;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String vehicleType;
		int hrEntry = -1, hrLeft = -1;
		int minEntry = -1, minLeft = -1;
		boolean catcher = true;

		System.out.print("Type of vehicle? ");

		vehicleType = scan.nextLine();
		while (!checker(vehicleType, -1, false)) {
			System.out.println("Wrong input!");
			System.out.print("Type of vehicle? ");
			vehicleType = scan.nextLine();
		}

		do {
			try {
				System.out.print("Hr vehicle entered lot? (0-24)");
				hrEntry = scan.nextInt();
				catcher = checker("null", hrEntry, true);
			} catch (Exception e) {
				System.out.println("Error!");
				scan.next();
			}
		} while (catcher);

		catcher = true;

		do {
			try {
				System.out.print("Min vehicle entered lot? (0-60)");
				minEntry = scan.nextInt();
				catcher = checker("null", minEntry, false);
			} catch (Exception e) {
				System.out.println("Error!");
				scan.next();
			}
		} while (catcher);

		catcher = true;

		do {
			try {
				System.out.print("Hr vehicle left lot? (0-24)");
				hrLeft = scan.nextInt();
				catcher = checker("null", hrLeft, true);
			} catch (Exception e) {
				System.out.println("Error!");
				scan.next();
			}
		} while (catcher);

		catcher = true;

		do {
			try {
				System.out.print("Min vehicle left lot? (0-60)");
				minLeft = scan.nextInt();
				catcher = checker("null", minLeft, false);
			} catch (Exception e) {
				System.out.println("Error!");
				scan.next();
			}
		} while (catcher);

		catcher = true;

		int[] time = { hrEntry, hrLeft, minEntry, minLeft };

		scan.close();
		cheque(vehicle, time);

	}

	public static boolean checker(String check, int checker, boolean intCheck) {
		if (checker == -1) {
			switch (check) {
				case "c":
				case "C":
					vehicle = "car";
					return true;
				case "t":
				case "T":
					vehicle = "truck";
					return true;
				case "b":
				case "B":
					vehicle = "bus";
					return true;
				default:
					return false;
			}
		} else {
			if (intCheck) {
				if (checker <= 24 && checker >= 0) {
					return false;
				} else {
					System.out.println("Wrong input!");
					return true;
				}
			} else {
				if (checker <= 60 && checker >= 0) {
					return false;
				} else {
					System.out.println("Wrong input!");
					return true;
				}
			}
		}
	}

	public static void cheque(String vehicle, int[] time) {

		int parkingTime = Math.abs(time[1] - time[0]);
		int minParkingTime = Math.abs(time[3] - time[2]);
		int rounded = parkingTime + (time[3] > time[2] ? 1 : 0);
		double cost;

		// compute for Cheque
		switch (vehicle) {
			case "car":
				if (rounded > 3) {
					cost = (rounded - 3) * 1.5;
				} else {
					cost = -1;
				}
				break;
			case "truck":
				if (rounded > 2) {
					cost = (rounded - 2) * 2.3 + 2;
				} else {
					cost = rounded * 1;
				}
				break;
			case "bus":
				if (rounded > 1) {
					cost = (rounded - 1) * 3.7 + 2;
				} else {
					cost = 2.00;
				}
				break;
			default:
				cost = -1;
		}

		// print out Cheque
		System.out.println("\n");
		System.out.println("  Parking Lot Charge");
		System.out.println("TIME-IN          " + time[0] + ":" + (time[2] < 10 ? "0" + time[2] : time[2]));
		System.out.println("TIME-OUT         " + time[1] + ":" + (time[3] < 10 ? "0" + time[3] : time[3]));
		System.out.println("                 ------");
		System.out.println("PARKING TIME     "
				+ (parkingTime > 0 ? parkingTime + ":" + (minParkingTime < 10 ? "0" + minParkingTime : minParkingTime)
						: "OVERTIME!"));
		System.out.println("ROUNDED TOTAL    " + rounded);
		System.out.println("                 ------");
		System.out.println("TOTAL CHARGE     $" + (cost < 0 ? "FREE" : String.format("%.2f", cost)));

	}
}
