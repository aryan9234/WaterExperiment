package com.experiments.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.experiments.WaterExperiment;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "WaterExperiment";
		config.width = 480;
		config.height = 320;
		new LwjglApplication(new WaterExperiment(), config);
	}
}
