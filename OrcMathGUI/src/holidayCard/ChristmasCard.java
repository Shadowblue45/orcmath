package holidayCard;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;

public class ChristmasCard extends GUIApplication {

	static ChristmasCard card;
	static Screen front;
	static Screen inside;
	
	public ChristmasCard(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		front = new CatalogScreen(getWidth(),getHeight());
		inside = new CatalogScreen(getWidth(),getHeight());
		setScreen(front);
	}

	public static void main(String[] args) {
		card = new ChristmasCard(800, 550);
		Thread go = new Thread(card);
		go.start();
	}

}
