package shadowBlue;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class VideoGames extends Component {

	public VideoGames() {
		super(40, 40, 100, 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.drawRect(0, 0, getWidth(), getHeight());
	}

}
