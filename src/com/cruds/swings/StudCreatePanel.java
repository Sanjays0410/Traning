package com.cruds.swings;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class StudCreatePanel extends JPanel {

	JButton btnCreate;
	JFrame parent;
	JPanel currentPanel;
	JTextField txtname;
	JToolBar toolbar;
	
	StudCreatePanel(JFrame parent)
	{
		this.parent=parent;
		currentPanel=this;
		btnCreate=new JButton("Create");
		txtname=new JTextField(20);
		toolbar=new JToolBar();
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				parent.remove(currentPanel);
				parent.add(new StudDisplayPanel(parent));
				parent.revalidate();
			/*	currentPanel.add(txtname);
				add(currentPanel);  */
			}
		});
		toolbar.add(btnCreate);
		add(toolbar);
		
	}
}
