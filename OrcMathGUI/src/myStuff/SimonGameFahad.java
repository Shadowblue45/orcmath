package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameFahad extends GUIApplication {

	public static SimonGameFahad game;
	public static SimonScreenFahad screen;

	public SimonGameFahad(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen = new SimonScreenFahad(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		game = new SimonGameFahad(800, 550);
		Thread go = new Thread(game);
		go.start();
	}

}
