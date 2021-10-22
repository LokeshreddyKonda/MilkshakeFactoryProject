package Command;


public class Manager {

	public static void command(ManagerCommand obj,String command) {
		if("1".equals(command)) {
			obj.executeCommand();
		}else if("2".equals(command)){
			obj.executeCommand();
		}
	}
}
