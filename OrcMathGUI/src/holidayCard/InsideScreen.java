package holidayCard;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import shadowBlue.VideoGames;

public class InsideScreen extends FullFunctionScreen implements FileRequester{

	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button outsideButton;
	private Graphic graphic;
	
	public InsideScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		graphic = new Graphic(0, 60, "resources/happy.png");
		outsideButton = new Button(30,30,100,30,"Go Outside",new Action() {
			
			@Override
			public void act() {
				ChristmasCard.card.setScreen(ChristmasCard.outside);
			}
		}
		);
		viewObjects.add(graphic);
		viewObjects.add(outsideButton);
	}

	public void addClick() {
		System.out.println("Click here to go to the next page.");
	}
	
	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
