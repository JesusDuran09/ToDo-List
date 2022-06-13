import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class buttonPanel extends JPanel {

	private JButton addTask;
	private JButton deleteTask;
	private JButton view;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	//Constructor
	buttonPanel(){
		this.setPreferredSize(new Dimension(400, 60));
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font ("Sans-serif", Font.PLAIN, 20));
		this.add(addTask);
		this.add(Box.createHorizontalStrut(5));
		
		view = new JButton("View Tasks");
		view.setBorder(emptyBorder);
		view.setFont(new Font ("Sans-serif", Font.PLAIN, 20));
		this.add(view);
		
		this.add(Box.createHorizontalStrut(5));
		deleteTask = new JButton("Delete Tasks");
		deleteTask.setBorder(emptyBorder);
		deleteTask.setFont(new Font ("Sans-serif", Font.PLAIN, 20));
		this.add(deleteTask);
		
	}
		
	public JButton getNewTask() {
		return addTask;
	}
	public JButton getdeleteTask() {
		return deleteTask;
	}
	public JButton getView() {
		return view;
	}

}
	