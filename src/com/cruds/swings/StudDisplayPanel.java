package com.cruds.swings;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StudDisplayPanel extends JPanel {
 JButton btnBack;
 JFrame parent;
 JPanel currentpanel;
 
 
 StudDisplayPanel(JFrame parent)
 
 {
	 this.parent=parent;
	 currentpanel=this;
	 btnBack=new JButton("BACK");
	 
	 btnBack.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			parent.remove(currentpanel);
			parent.add(new StudCreatePanel(parent));
			parent.revalidate();
			
		}
	});
	 add(btnBack);
	 
 }
}
