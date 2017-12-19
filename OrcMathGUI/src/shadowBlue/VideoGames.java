package shadowBlue;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class VideoGames extends AnimatedComponent {
	
	private int age;
	private String name;
	private double price;
	private String imgAddress;

	public VideoGames(String name,int age) {
		super(100, 100, 280, 280);
		this.name = name;
		this.age = age;
		addSequence("resources/jojo.png", 150, 0, 2225, 140, 140, 7);
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
