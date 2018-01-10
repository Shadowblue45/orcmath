package myStuff;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonDavid extends Button implements ButtonInterfaceFahad {
	
	private Color color;

	public ButtonDavid(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		// TODO Auto-generated constructor stubx
	}
	public void drawButton(Graphics2D g, boolean hover){
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		drawShape(g, hover);
		g.setColor(getForeground());
		g.setFont(getFont());
		FontMetrics fm = g.getFontMetrics();
		
		if(getText()!= null){
			g.setColor(getForeground());
			String t = getText();
			//just in case text is too wide, cut off
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff --;
				t = t.substring(0,cutoff); 
			}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, 
					(getHeight()+fm.getHeight()-fm.getDescent())/2);
		}
	}
	@Override
	public void highlight() {
		setColor(Color.RED);
		
	}
	@Override
	public void dim() {
		setColor(color);
		
	}
	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}
	@Override
	public void getAButton() {
		// TODO Auto-generated method stub
		
	}

	

	

}
