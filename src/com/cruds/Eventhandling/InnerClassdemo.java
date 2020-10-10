package com.cruds.Eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InnerClassdemo  extends Applet{
	@Override
	public void init() {
		addMouseListener(new MyMouseAdapter2());
	}
class MyMouseAdapter2 extends MouseAdapter
{
 @Override
	public void mouseClicked(MouseEvent arg0) {
		showStatus("MOUSE CLICKED"  );
	}
}
}

