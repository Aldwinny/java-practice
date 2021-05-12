package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.GraphicsDevice.WindowTranslucency;

@SuppressWarnings("serial")
public class Frame extends JFrame{
	Frame() {
		super("JFrame title goes here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Icon of the Frame
		ImageIcon image = new ImageIcon("Wizard hat PNG.png");
		this.setIconImage(image.getImage());
		
		
		this.setResizable(true);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setBackground(Color.black);
		
		JFrame.setDefaultLookAndFeelDecorated(true);
	}
	
	@SuppressWarnings("unused")
	private boolean testTransparency() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		
		if (!gd.isWindowTranslucencySupported(WindowTranslucency.TRANSLUCENT)) {
			System.err.println("Translucency is not supported. Trying non translucent swing component");
			return false;
		} 
		
		return true;
	}
}
