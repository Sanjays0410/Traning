package com.cruds.swings;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframedemo extends JFrame
{
	JLabel lblMsg;//namaing covention is important
Jframedemo()
{
	setTitle("swings demo");
	setSize(200,200);
	setLocationRelativeTo(null);// for assign center
	setDefaultCloseOperation(EXIT_ON_CLOSE);//static final
	lblMsg=new JLabel("hello world");
	add(lblMsg);
	setVisible(true);
}
	public static void main(String[] args) {
		new Jframedemo();
	}
}
