package Command;

public class BuyProductsInCart implements ManagerCommand{

	@Override
	public void executeCommand() {
		System.out.println("Getting Ready For Payment");
		try {
			Thread.sleep(40);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Billing Done");
	}

}
