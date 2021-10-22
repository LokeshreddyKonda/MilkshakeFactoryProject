package Factory;

public class Cheese extends MilkProduct{

	private String Quality;
	private String Quantity;
	private String CreamContent;

	
	public Cheese(String Quality, String Quantity, String CreamContent) {
		super(Quality, Quantity, CreamContent);
		this.Quality = Quality;
		this.Quantity =Quantity;
		this.CreamContent = CreamContent;
	}


	@Override
	public Object createOrderedMilkShake() {
		return new Cheese("good","5Liters","10%");
	}


	@Override
	public String toString() {
		return "Cheese [Quality=" + Quality + ", Quantity=" + Quantity + ", CreamContent=" + CreamContent + "]";
	}
	
	

}
