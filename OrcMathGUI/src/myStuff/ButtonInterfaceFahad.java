package myStuff;

import java.awt.Color;

import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceFahad extends Clickable {

	void highlight();

	void dim();

	void setColor(Color color);

}
