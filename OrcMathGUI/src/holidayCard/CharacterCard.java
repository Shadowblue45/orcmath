package holidayCard;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class CharacterCard extends AnimatedComponent {
	
	private int age;
	private String name;
	private double price;
	private String imgAddress;

	public CharacterCard(int x,int y) {
		super(x, y, 90, 180);
		addSequence("resources/disgaea.png", 150, 4, 188, 90, 180, 6);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		super.update(g);
	}
	
	public String toString() {
		return name + ", " + age;
	}

}
