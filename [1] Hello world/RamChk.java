import java.util.Scanner;

/**
 * Branching if statements. Cool!
 * 
 * @author Aldwin Dennis Reyes
 */
class RamChk {
	public static void main(String Args[]) {
		Scanner calc = new Scanner(System.in);
		int ram, ram_speed;
		boolean ram_type;
		String ram_type2, speed;
		System.out.println("Is your RAM size in Megabytes or Gigabytes?");
		System.out.println("True if Gbs/False otherwise");
		ram_type = calc.nextBoolean();
		System.out.println("Enter amount of RAM:");
		ram = calc.nextInt();
		System.out.println("Enter RAM speed:");
		ram_speed = calc.nextInt();

		if (ram_type == true) {
			ram_type2 = "Gigabytes";
			if (ram <= 4) {
				speed = "You probably have a slow computer";
			} else {
				speed = "Woah, nice rig";
			}
		} else {
			ram_type2 = "Megabytes";
			if (ram <= 4096) {
				speed = "You probably have a slow computer";
			} else {
				speed = "Woah, nice rig";
			}
		}

		System.out.println(
				speed + ".\nYou have " + ram + " " + ram_type2 + " of RAM with the speed of " + ram_speed + " Mhz.");

	}
}