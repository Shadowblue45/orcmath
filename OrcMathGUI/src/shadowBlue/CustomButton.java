package shadowBlue;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {
	
	private String s1 = "It was";
	private String s2 = "I Dio";
	private Color blue;

	public CustomButton(int x, int y) {
		super(x, y, 20, 40, "", null);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	}
	
	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.BLUE);
		g.drawString(s1, 10, 20);
		g.drawString(s2, 20, 20);
		g.fillRect(10, 10, 10, 20);
	}

	void updateString1(String string){
		
	}

	void updateString2(String string){
		
	}

	void setIconColor(Color color) {
		
	}

}
