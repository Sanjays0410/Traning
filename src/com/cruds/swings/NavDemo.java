package com.cruds.swings;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NavDemo extends JFrame {

	JFrame parent;
	public NavDemo(){
		parent=this;
		setTitle("Nav Demo"); 
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new StudCreatePanel(parent));
		setVisible(true);
	
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
			new NavDemo();  
				 
			}
		});
	}
	
}
