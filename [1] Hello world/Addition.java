import java.util.Scanner;

/**
 * Addition of two numbers. A pretty good start in my journey.
 * 
 * @author Aldwin Dennis Reyes
 */
class Addition {
	public static void main(String Args[]) {
		Scanner calc = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter the first number");
		fnum = calc.nextDouble();
		System.out.println("Enter the second number");
		snum = calc.nextDouble();
		answer = fnum + snum;
		System.out.println("The answer is:");
		System.out.println(answer);
	}
}