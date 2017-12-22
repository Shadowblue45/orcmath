package holidayCard;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;
import guiTeacher.components.Graphic;

public class CharacterCard extends AnimatedComponent {
	private Graphic graphic;
	
	public CharacterCard(int x,int y) {
		super(x, y, 90, 180);
		graphic = new Graphic(50, 100, "resources/happy.png");
		return graphic;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		super.update(g);
	}
}
