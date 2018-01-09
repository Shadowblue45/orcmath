package myStuff;

public class MoveDavid implements MoveInterfaceFahad {
	private ButtonInterfaceFahad b;

	public MoveDavid() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ButtonInterfaceFahad getButton() {
		return b;
	}

	@Override
	public void getMove(int bIndex) {
		return  SimonScreenFahad.button[bIndex];
		
	}

}
