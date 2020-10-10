package com.cruds.swings;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Framedemo extends Frame
{
Framedemo()
{
	setTitle("AWT DEMO");
	setSize(300,300);
	setLocation(100,200);
	setVisible(true);
	
}
public static void main(String[] args) {
	Frame f=new Framedemo ();
	f.addWindowListener(new WindowAdapter() {
			
	public	void windowClosing(WindowEvent e){	
		System.exit(0);
	}
	});
	
	
	
}
}
