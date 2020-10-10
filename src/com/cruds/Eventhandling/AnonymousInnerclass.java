package com.cruds.Eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousInnerclass extends Applet {
	@Override
	public void init( ) {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				showStatus("mouse clicked");///all process will run in addmouse listener
			}
		});
	}

}
