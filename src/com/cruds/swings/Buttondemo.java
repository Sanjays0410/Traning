package com.cruds.swings;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Buttondemo extends JFrame
{
JButton btnclose;
JButton btnping;
JPanel panel;
	Buttondemo()
	{
		setTitle("button demo");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel=new JPanel();
		
		btnclose=new JButton("close");
		btnping=new JButton("ping"); 
		btnclose.addActionListener(new ActionListener() {
			//btnping.addActionListener(new ActionListener)()
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		btnping.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getToolkit().beep();
				
			}
		});
	panel.add(btnclose);// add to jframe
	panel.add(btnping);
	add(panel);
		setVisible(true);
}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new Buttondemo();	
				
			}
		
	});
	}
}
