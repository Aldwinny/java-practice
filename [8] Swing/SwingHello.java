import java.awt.*;
import java.util.Arrays;

import javax.swing.*;

public class SwingHello {

	public SwingHello() {
	}

	public static void main(String[] args) throws Exception {
		System.out.printf("Java Version: %s\nSupported Fonts: %s", System.getProperty("java.version"),
				Arrays.toString(Toolkit.getDefaultToolkit().getFontList()).replace("[", "").replace("]", ""));
		frame();
	}

	public static void frame() {
		JFrame a = new JFrame("My first swing app");
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(300, 300);
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		a.setLayout(null);
		addComponents(a);
	}

	public static void addComponents(JFrame a) {
		JLabel nameLabel = new JLabel("Hello");
		nameLabel.setBounds(40, 20, 100, 30);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setVerticalAlignment(SwingConstants.CENTER);
		a.add(nameLabel);
		nameLabel.setFont(fontSelect(3));
		nameLabel.setFont(fontSelect(1).deriveFont(20f));

		JTextField field = new JTextField();
		field.setBounds(160, 20, 100, 30);
		field.setEditable(false);
		a.add(field);

		JButton button = new JButton("Yes");
		button.setBounds(100, 70, 100, 30);
		a.add(button);

		button.addActionListener(e -> {
			field.setText(field.getText().concat(Integer.toString((int) Math.round(Math.random()))));
			nameLabel.setFont(fontSelect(getRandomInteger(3, 0)));
			System.out.print(getRandomInteger(3, 0));
		});

		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(40, 150, 220, 70);
		greenPanel.setLayout(new BorderLayout());
		greenPanel.setBackground(Color.magenta);
		greenPanel.add(nameLabel);
		a.add(greenPanel);
	}

	private static int getRandomInteger(int i, int j) {
		return ((int) (Math.random() * (i) + j));
	}

	public static Font fontSelect(int x) {
		switch (x) {
			case 1:
				return new Font("Courier", Font.BOLD, 16);
			case 2:
				return new Font("Wingdings", Font.PLAIN, 13);
			case 3:
				return new Font("TimesRoman", Font.PLAIN, 12);
			default:
				return new Font("Bahnschrift", Font.ITALIC, 12);
		}
	}
}
