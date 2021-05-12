package swing;

import java.awt.Color;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	Panel() {
		this(Color.white);
	}
	
	Panel(Color color) {
		this.setBackground(color);
		this.setBounds(0,0,250,250);
	}
	
	
}
