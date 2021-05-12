import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Me, trying to learn about files..
 * 
 * @author Aldwin Dennis Reyes
 */
public class PlayingWithFiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input directory");
		File text = new File(sc.nextLine());
		int year = 0;
		Long populu = 0L;
		int temp = 0;
		Long temp2 = 0L;
		long change = 0L;
		try (Scanner scan = new Scanner(text)) {
			scan.nextLine();
			while (scan.hasNextInt()) {
				temp = scan.nextInt();
				temp2 = Long.parseLong(scan.next().replaceAll("\\,", "").trim());
				if (populu == 0L) {
					change = 0;
					year = temp;
					populu = temp2;
				}
				if (temp2 - populu >= change) {
					change = temp2 - populu;
					year = temp;
					populu = temp2;
				}
				System.out.println(change);
			}

		} catch (IOException e) {
			System.out.println("IO Error caught!");
		} catch (Exception o) {
			System.out.println("Error caught!");
			o.printStackTrace();
		}
		System.out.println(temp2);
		System.out.printf("%d %d", year, populu);
	}

}
