package Command;

public class Logout implements ManagerCommand{

	@Override
	public void executeCommand() {
		System.out.println("User Logged Out Successfully");
	}

}
