package com.cruds.Eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventdemo  extends Applet implements KeyListener
{

	String msg="";
	
	@Override
	public void init() {
		addKeyListener(this);
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(msg,10,10);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		showStatus("keypressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("keyreleased");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		msg=msg+e.getKeyChar();
		showStatus("key typed====");
		repaint();
	}

}
