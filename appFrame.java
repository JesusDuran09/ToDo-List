import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class appFrame extends JFrame {
		
	private buttonPanel bttnPanel;
	private titleBar title;
	private list List;
	
	private JButton addTask;
	private JButton deleteTask;
	private JButton view;
	
	appFrame(){
		this.setSize(400,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		title = new titleBar();
		List = new list();
		bttnPanel = new buttonPanel();
		
		this.add(title, BorderLayout.NORTH);
		this.add(List, BorderLayout.CENTER);
		this.add(bttnPanel, BorderLayout.SOUTH);
		
		addTask = bttnPanel.getNewTask();
		deleteTask = bttnPanel.getdeleteTask();
		view = bttnPanel.getView();
		
		addListeners();

	}
	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			task Task = new task();
			List.add(Task);
			List.updateNum();
			
			Task.getDone().addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Task.changeState();
				}
			});
			revalidate();
			
		}
		});
	}
	
}
