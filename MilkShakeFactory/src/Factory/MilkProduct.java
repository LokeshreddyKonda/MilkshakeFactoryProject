package Factory;

public abstract class MilkProduct {
	
	private String Quality;
	private String Quantity;
	private String CreamContent;
	
	
	public MilkProduct(String Quality, String Quantity, String CreamContent) {
		super();
		this.Quality = Quality;
		this.Quantity = Quantity;
		this.CreamContent = CreamContent;
	}

	@Override
	public String toString() {
		return "MilkProduct [Quality=" + Quality + ", Quantity=" + Quantity + ", CreamContent=" + CreamContent + "]";
	}







	public abstract Object createOrderedMilkShake();
	

}
