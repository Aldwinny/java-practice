package swing;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

@SuppressWarnings("serial")
public class Button extends JButton {
	Button() {
		this("");
	}
	
	Button(String text) {
		super(text);
		
		this.setIcon(new ImageIcon("Wizard hat PNG.png"));
		this.setVerticalAlignment(CENTER);
		this.setVerticalTextPosition(BOTTOM);
		this.setHorizontalTextPosition(CENTER);
		this.setBounds(180,100, 120, 100);
		this.addActionListener(e -> {
			System.err.print("HAHA");
		});
		this.setFocusable(false); //removes the focus box on the button
		this.setFont(new Font("Comic Sans", Font.BOLD, 25));
		this.setIconTextGap(-10);
		this.setForeground(Color.red);
		this.setBackground(Color.black);
		this.setBorder(BorderFactory.createEtchedBorder());
		
	}


}
