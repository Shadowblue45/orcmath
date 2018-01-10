package myStuff;

public class MoveDavid implements MoveInterfaceFahad {
	private ButtonInterfaceFahad b;

	public MoveDavid(ButtonInterfaceFahad button) {
		this.b = button;
	}

	@Override
	public ButtonInterfaceFahad getButton() {
		return b;
	}

	@Override
	public void getMove(int bIndex) {
		
		
	}

}
