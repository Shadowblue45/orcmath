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

public class OutsideScreen extends FullFunctionScreen implements FileRequester{

	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button insideButton;
	private Graphic graphic;
	
	public OutsideScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		graphic = new Graphic(0, 60, "resources/grinch.jpg");
		insideButton = new Button(30,30,100,30,"Go Inside",new Action() {
			
			@Override
			public void act() {
				ChristmasCard.card.setScreen(ChristmasCard.inside);
				
			}
		}
		);
		viewObjects.add(graphic);
		viewObjects.add(insideButton);
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
