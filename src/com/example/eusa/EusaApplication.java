package com.example.eusa;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class EusaApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Eusa Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
