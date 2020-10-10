package com.cruds.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TextFeildExample  extends JFrame{

	JTextField txtName;
	JPasswordField txtPwd;
	JLabel lblName;
	JLabel lblpwd;
	JButton btnClick;
	JPanel panel;

	public TextFeildExample()
	{
		setTitle("TextField Example");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		lblName = new JLabel("Name:");
		txtName = new JTextField(10);
		lblpwd = new JLabel("PassWord:");
		txtPwd = new JPasswordField(10);
		btnClick = new JButton("Login");

		btnClick.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtName.getText());
				System.out.println(txtPwd.getPassword());
				
			}
			});

		
		
		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblpwd);
		panel.add(txtPwd);
		panel.add(btnClick);

		add(panel);//add to jframe
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TextFeildExample();
				
			}
		});
	}
}