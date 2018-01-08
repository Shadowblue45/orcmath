package myStuff;

public class MoveDavid implements MoveInterfaceFahad {

	public MoveDavid() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ButtonInterfaceFahad getButton() {
		return null;
	}

	@Override
	public void getMove(int bIndex) {
		return  SimonScreenFahad.button[bIndex];
		
	}

}
