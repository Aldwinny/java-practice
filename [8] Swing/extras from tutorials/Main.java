package swing;

public class Main {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.setLayout(null);
		
		
		
		Button button = new Button("Dance");
		MainLabel label = new MainLabel();
		label.setBounds(150, 250, 500, 150);
		label.setVisible(false);
		
		button.addActionListener(e -> label.setVisible(true));
		
		frame.add(label);
		frame.add(button);
		
	}

}
