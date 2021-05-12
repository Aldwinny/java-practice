
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Play {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner scanner = new Scanner(System.in);

		File file1 = new File("save.wav");
		File file2 = new File("purplehaze.wav");

		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);

		String response = "";

		while (!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = quit");
			System.out.print("Please enter your choise: ");

			response = scanner.next();
			response = response.toUpperCase();

			switch (response) {
				case "P":
					clip.start();
					break;
				case "S":
					clip.stop();
					break;
				case "R":
					clip.setMicrosecondPosition(0);
					break;
				case "Q":
					clip.close();
					break;
				default:
					System.out.println("Not a valid response..");
			}
		}

		System.out.println("BYEEE!");

	}

}