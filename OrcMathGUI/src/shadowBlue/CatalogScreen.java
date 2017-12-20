package shadowBlue;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester{

	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button addButton;
	private FileOpenButton openButton;
	private VideoGames catalog;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new VideoGames("Sly Cooper",22);
		descriptionField = new TextField(100, 100, 200, 30, "Text goes here","Description here");
		text = new TextArea(0,300,100,30,"button");
		viewObjects.add(text);
		viewObjects.add(descriptionField);
		addButton = new Button(30,30,100,30,"Add Button",new Action() {
			
			@Override
			public void act() {
				addClick();
			}
		}
		);
		viewObjects.add(addButton);
		addButton = new Button(30,70,100,30,"Load Button",new Action() {
			
			@Override
			public void act() {
				addClick();
			}
		}
		);
		viewObjects.add(addButton);
		addButton = new Button(30,110,100,30,"Save Button",new Action() {
			
			@Override
			public void act() {
				addClick();
			}
		}
		);
		viewObjects.add(addButton);
		openButton = new FileOpenButton(40, 480, 200, 30, null, this);
		viewObjects.add(openButton);
	}

	public void addClick() {
		VideoGames g = new VideoGames(descriptionField.getText(), intValue.getText());
		catalog.add(g);

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
