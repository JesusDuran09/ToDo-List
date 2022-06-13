import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class titleBar extends JPanel {

	//Constructor
	titleBar(){
		this.setPreferredSize(new Dimension(400,60));
		
		JLabel titleText = new JLabel("To-Do List");
		titleText.setPreferredSize(new Dimension (200, 80));
		titleText.setFont(new Font ("Sans-serif", Font.BOLD, 25));
		titleText.setAlignmentX(JLabel.CENTER);
		
		this.add(titleText);
	}
}
