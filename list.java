import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class list extends JPanel{

	list(){
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(2);
		
		this.setLayout(layout);
	}
	
	public void updateNum() {
		Component[] listItems = this.getComponents();
		
		for(int i = 0; i < listItems.length; i++) {
			if(listItems[i] instanceof task) {
				((task)listItems[i]).changeIndex(i+1);
			}
		}
	}
}
