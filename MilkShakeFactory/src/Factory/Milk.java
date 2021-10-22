package Factory;

public class Milk extends MilkProduct{

	private String Quality;
	private String Quantity;
	private String CreamContent;
	
	public Milk(String Quality, String Quantity, String CreamContent) {
		super(Quality, Quantity, CreamContent);
		this.Quality = Quality;
		this.Quantity = Quantity;
		this.CreamContent = CreamContent;
	}

	@Override
	public Object createOrderedMilkShake() {
		return new Milk("good","3L","15%");
	}

	@Override
	public String toString() {
		return "Milk [Quality=" + Quality + ", Quantity=" + Quantity + ", CreamContent=" + CreamContent + "]";
	}

	
}
