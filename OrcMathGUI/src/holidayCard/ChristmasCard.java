package holidayCard;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;

public class ChristmasCard extends GUIApplication {

	public static ChristmasCard card;
	public static Screen outside;
	public static Screen inside;
	
	public ChristmasCard(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		outside = new OutsideScreen(getWidth(),getHeight());
		inside = new InsideScreen(getWidth(),getHeight());
		setScreen(outside);
	}

	public static void main(String[] args) {
		card = new ChristmasCard(800, 550);
		Thread go = new Thread(card);
		go.start();
	}

}
