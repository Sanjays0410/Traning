package com.cruds.Eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends Applet implements MouseListener {

	String msg=" ";
	
	public void init()
	{
		addMouseListener(this);
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 30, 30);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	 msg="mouse clicked" +e.getX()+ ":"+e.getY();
	repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	 msg=	"mouse entered";
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		 msg="mouse exited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		 msg="mouse pressed";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		 msg="mouse released";
		repaint();
	}

}
