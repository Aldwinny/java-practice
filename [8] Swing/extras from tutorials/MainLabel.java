package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MainLabel extends JLabel {

	public MainLabel() {
		this.setText("Do you even code, bro?");
		this.setIcon(new ImageIcon("Wizard hat PNG.png"));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setHorizontalTextPosition(JLabel.CENTER); //centers the label text
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setForeground(new Color(0x029df0));
		this.setBackground(Color.black);
		this.setFont(new Font("MV Boli", Font.BOLD, 30));
		this.setIconTextGap(-10);
		this.setOpaque(true);
		
		this.setBorder(BorderFactory.createLineBorder(Color.green, 3));
	}

}
