package com.cruds.Eventhandling;


import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterdemo extends Applet {
@Override
public void init() {
	addMouseListener(new MyMouseAdapter(this));
}
class MyMouseAdapter extends MouseAdapter
{
	Applet parent;
	MyMouseAdapter(Applet applet)
	{
		parent=applet;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		parent.showStatus("mouse clicked");
	}
}
}


